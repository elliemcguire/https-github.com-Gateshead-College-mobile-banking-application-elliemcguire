package local_retailer;

import java.util.Scanner;

public class MainMenu {

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args){
        MainMenu mainMenu = new MainMenu();
        displayMenu();
    }

    public static void displayMenu() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hello welcome back, these are the items we have in stock:");
        System.out.println("1 - Bananas");
        System.out.println("2 - Oranges");
        System.out.println("3 - Apples");
        System.out.println("4 - Strawberries");
        System.out.println("5 - Plums");
        System.out.println("Please select a fruit");
        byte choice = Byte.parseByte(myScanner.nextLine());
        processChoice(choice);
    }

    private static void processChoice(byte choice) {

        switch (choice) {

            case 1:
                System.out.println("Bananas selected");
                break;

            case 2:
                System.out.println("Oranges selected");
                break;

            case 3:
                System.out.println("Apples selected");
                break;

            case 4:
                System.out.println("Strawberries selected");

            case 5:
                System.out.println("Plums selected");

            default:
                System.out.println("Invalid selection please choose an option from 1-5");
                displayMenu();
        }

    }


}
