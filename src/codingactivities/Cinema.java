package codingactivities;

import java.util.ArrayList;
import java.util.Scanner;

public class Cinema {

    private void customer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is you first name?");
        String forename = scanner.nextLine();
        System.out.println("What is your surname?");
        String surname = scanner.nextLine();
        System.out.println("What is your contact number");
        String contactNumber = scanner.nextLine();
    }

    private void showing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What film would you like to see?");
        String film = scanner.nextLine();
        System.out.println("which seat would you like to sit in?");
    }
}
