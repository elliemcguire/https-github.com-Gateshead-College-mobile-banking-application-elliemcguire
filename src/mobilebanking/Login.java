package mobilebanking;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    String correctUsername = "Elliemcgurie";
    String correctPassword = "password";

    int attempts = 0;
    ArrayList<User> users;

    public static void main(String[] args) {
        Login login = new Login();
        login.getApplicationData();
        login.getUserDetails();
    }

    private void getApplicationData() {
        Initialise init = new Initialise();
        users = init.generateUsers();
    }

    private void getUserDetails() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hello, Please enter your username:");
        String username = myScanner.nextLine();
        System.out.println("Please enter your password:");
        String password = myScanner.nextLine();
        int counter = 1;
        for (User u : users) {
            if (username.equalsIgnoreCase(u.getUsername()) && password.equals(u.getPassword())) {
                MainMenu mm = new MainMenu(u.getName());
                mm.displayMainMenu(username);
                break;
            } else if(counter == users.size()){
                attempts++;
                if (attempts < 3) {
                    System.out.println("Incorrect details provided,please try again.");
                    getUserDetails();
                } else {
                    System.out.println("You have exceeded the number of login attempts, please try again later!");
                }
            }

            counter++;

        }
    }
}
