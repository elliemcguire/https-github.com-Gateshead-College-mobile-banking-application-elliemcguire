package datatypes;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, Please complete all fields to register.");
        System.out.println("What is your first name?");
        String forename = scanner.nextLine();
        System.out.println("what is your surname?");
        String surname = scanner.nextLine();
        System.out.println("How old are you?");
        byte age = Byte.parseByte(scanner.nextLine());
        System.out.println("Would you like to recieve our newsletter? (y/n)");
        boolean newsletter;
        if (scanner.nextLine().equalsIgnoreCase("y")) {

            newsletter = true;
        } else
            newsletter = false;

        System.out.println("Please check and confirm the details entered are correct:");
        System.out.println("Name: " + forename + " " + surname + ", " + age + " years old.");
        System.out.println("Recieving our newsletter: " + newsletter);
        System.out.println("Are these details correct? (y/n");
        if (scanner.nextLine().equals("y")) {
            System.out.println("thank you for registering, Goodble");
        } else {
            System.out.println("Registration aborted, please start again.");
        }
    }
}

