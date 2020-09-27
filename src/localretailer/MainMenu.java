package localretailer;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {

    Scanner myScanner = new Scanner(System.in);
    private User user;


    public static void main(String[] args) {
        MainMenu mainMenu = new MainMenu();
        mainMenu.displayMenu();
    }


    public void displayMenu() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Hello welcome back, these are the items we have in stock:");
        System.out.println("1 - Bananas");
        System.out.println("2 - Oranges");
        System.out.println("3 - Apples");
        System.out.println("Please select a fruit");
        byte choice = Byte.parseByte(myScanner.nextLine());
        processChoice(choice);
    }

    private void processChoice(byte choice) {
        switch (choice) {
            case 1:
                ArrayList<Bananas> bananas = bananasArrayList();
                for (Bananas b : bananas) {
                    System.out.println("You have chosen " + b.getFruitType());;
                    System.out.println("Product price: " + b.getBananasPrice());
                    System.out.println("Product ID: " + b.getBananasID());
                    System.out.println("Product stock: " + b.getBananasStock());
                }
                break;
            case 2:
                ArrayList<Oranges> oranges = orangesArrayList();
                for (Oranges o : oranges) {
                    System.out.println("You have chosen Oranges");
                    System.out.println("Product price: " + o.getOrangesPrice());
                    System.out.println("Product ID: " + o.getOrangesID());
                    System.out.println("Product stock: " + o.getOrangesStock());
                }
                break;
            case 3:
                ArrayList<Apples> apples = applesArrayList();
                for (Apples a : apples) {
                    System.out.println("You have chosen Apples");
                    System.out.println("Product price: " + a.getApplesPrice());
                    System.out.println("Product ID: " + a.getApplesID());
                    System.out.println("Product stock: " + a.getApplesStock());
                }
                break;
            default:
                System.out.println("Invalid selection please choose an option from 1-3");
                displayMenu();
        }


    }

    private ArrayList<Bananas> bananasArrayList() {
        ArrayList<Bananas> bananas = new ArrayList<>();
        bananas.add(new Bananas("Banana", "3.00", 1, 40));
        bananas.add(new Bananas("Banana", "1.50", 2, 45));
        bananas.add(new Bananas("Banana", "2.00", 3,50));
        return bananas;
    }

    private ArrayList<Oranges> orangesArrayList() {
        ArrayList<Oranges> oranges = new ArrayList<>();
        oranges.add(new Oranges("£2.50", 4, 51));
        oranges.add(new Oranges("£2.75", 5, 63));
        oranges.add(new Oranges("£1.99", 6, 55));
        return oranges;
    }

    private ArrayList<Apples> applesArrayList() {
        ArrayList<Apples> apples = new ArrayList<>();
        apples.add(new Apples("£1.60", 7, 56));
        apples.add(new Apples("£2.40", 8, 57));
        apples.add(new Apples("£2.10", 9, 33));
        return apples;
    }

}

