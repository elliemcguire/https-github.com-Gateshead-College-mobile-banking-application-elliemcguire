package codingactivities;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        System.out.println("What is the capital of Spain?");
    }

    public String capital(String menu) {
        String capital = "";

        switch (capital.toLowerCase()) {
            case "Paris":
                return "Incorrect, please try again";

            case "Madrid":
                return "Correct";

            case "Berlin":
                return "Sorry you're incorrect";

            default:
                return "Try again!";
        }

//    private void menu() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is the capital of Spain?" + "Paris" + "Madrid" + "Berlin");
//        String capital = scanner.nextLine();
//
//        if (capital.equalsIgnoreCase("Paris")) {
//            return "Incorrect";
//        } else if (capital.equalsIgnoreCase("Madrid")) {
//            return "Correct!";
//        } else if (capital.equalsIgnoreCase("Berlin")) {
//            return "Incorrect";
//        } else {
//            return "Incorrect";
//        }
//
//
    }
}
