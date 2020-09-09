package codingactivities;

import java.util.Scanner;

public class Tasks {

    public static void main(String[] args) {
        Tasks.task();
    }

    private static void task() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, please enter you age!");
        int age = Integer.parseInt(scanner.nextLine());

        if (age < 16) {
            System.out.println("You're still so young!");
        } else if (age >16 && age < 20) {
            System.out.println("You're coming to the end of your teen years!");
        } else if (age >19 && age < 25) {
            System.out.println("Apparently you need to grow up!");
        } else if (age >24 && age < 30) {
            System.out.println("When did life become all about work?");
        } else if (age >29 && age < 40) {
            System.out.println("Your body is falling apart!");
        } else if (age >39 && age < 50) {
            System.out.println("The kids are almost at the age where they leave you!");
        } else if (age >49) {
            System.out.println("Time for a mid life crisis");
        } else {
            System.out.println("Error, please try again");
        }
    }

}

