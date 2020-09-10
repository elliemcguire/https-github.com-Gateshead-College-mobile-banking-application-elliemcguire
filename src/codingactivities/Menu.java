package codingactivities;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, please select one of the following options about how you feel today.");
        System.out.println("Happy");
        System.out.println("Sad");
        System.out.println("Angry");
        String choice = scanner.nextLine();
        System.out.println(menu(choice));
    }

    public static String menu(String choice) {
        if (choice.equalsIgnoreCase("happy")) {
            return "I'm glad to hear that!";
        } else if (choice.equalsIgnoreCase("sad")) {
            return "Maybe try stroking a dog to cheer you up.";
        } else if (choice.equalsIgnoreCase("angry")) {
            return "Smash some plates!";
        } else {
            return "Exit";
        }
    }
}