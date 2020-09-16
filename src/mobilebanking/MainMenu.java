package mobilebanking;

import java.util.Scanner;

public class MainMenu {
    String username;
    Scanner myScanner = new Scanner(System.in);

    public MainMenu(String username){
        this.username = username;
    }
    public void displayMainMenu(String username) {
        System.out.println("Welcome, please choose one of the following options " + username);
        System.out.println("1. Open a new Account");
        System.out.println("2. View your Accounts");
        System.out.println("3. Close an Account");
        System.out.println("4. Logout");
        byte choice = Byte.parseByte(myScanner.next());
        getAction (choice);
    }
    private void getAction(byte choice) {
        switch(choice){
            case 1:
                System.out.println("Open account selected.");
                break;
            case 2:
                System.out.println("View accounts selected.");
                viewAccounts();
                break;
            case 3:
                System.out.println("Close account selected.");
                break;
            case 4:
                System.out.println("Logout option selected.");
                break;
            default:
                System.out.println("Invalid option selected please choose option between 1-4.");
        }
        displayMainMenu(username);
    }
    private void viewAccounts() {
    }
}