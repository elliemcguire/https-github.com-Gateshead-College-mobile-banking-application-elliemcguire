package library;

import mobilebanking.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    Scanner scn = new Scanner(System.in);
    Book[] books = new Book[5];
    Member[] members = new Member[5];
    Loan[] loan = new Loan[2];



    public static void main(String[] args) {
        Library lib = new Library();
        lib.initialise();
        lib.menu();
    }

    private void menu() {
        System.out.println("Hello, welcome to Ellie's library");
        System.out.println("Please select an option from the list below");
        System.out.println("1 - Search for a book");
        System.out.println("2 - Check if a book is available");
        System.out.println("3 - Search for books by author");
        byte choice = Byte.parseByte(scn.nextLine());
        handleChoice(choice);
    }

    private void initialise() {
        books[0] = new Book(1, "Of Mice and Men", "John Stienbeck", "1937");
        books[1] = new Book(2, "Pride and Prejudice", "Jane Austin", "1813");
        books[2] = new Book(3, "The Great Gatsby", "F.Scott Fitzgerald", "1925");
        books[3] = new Book(4, "Moby Dick", "Herman Melville", "1815");
        books[4] = new Book(5, "Ulysees", "James Joyce", "1922");

        Member[] members = new Member[0];
        members[0] = new Member(1, "Ellie", "McGure", (byte) 19);
        members[1] = new Member(2, "Maisie", "Hire", (byte) 19);
        members[2] = new Member(3, "Ella", "Walker", (byte) 20);
        members[3] = new Member(4, "Alex", "Mcguire", (byte) 22);
        members[4] = new Member(5, "Kath", "McGuire", (byte) 54);

        Loan[] loans = new Loan[0];
        loans[0] = new Loan(2, 4);
        loans[1] = new Loan(5, 2);

    }

    private void handleChoice(byte choice) {
        switch (choice) {
            case 1:
                searchBook();
                break;

            case 2:
                checkBook();
                break;

            case 3:
                searchAuthor();
                break;

            default:
                System.out.println("Invalid input, please try again!");
                menu();

        }
    }

    private void checkBook() {
        System.out.println("What is the name of the book you would like to check?");
        String title = scn.nextLine();

        for (int i = 0; i < books.length; i++) {
//            if (books[i].bookID.equalsIgnoreCase(bookID)) {
                System.out.println("That book is available to read");
                System.out.println("Please return to the main menu");
                menu();
//            } else if (i == books.length - 1) {
                System.out.println("Sorry that book is unavailable");
                System.out.println();
                menu();
            }
        }
//    }

    private void searchBook() {
        System.out.println("What is the name of the book you would like?");
        String title = scn.nextLine();

        for (int i = 0; i < books.length; i++) {
            if (books[i].bookTitle.equalsIgnoreCase(title)) {
                System.out.println("We stock that in this library!");
                System.out.println("Please return to the main menu to check if it is available");
                menu();
            } else if (i == books.length - 1) {
                System.out.println("Sorry we do not have that book");
                System.out.println();
                menu();
            }
        }
    }

    private void searchAuthor() {
        System.out.println("What is the name of the author you would like?");
        String author = scn.nextLine();

        for (int i = 0; i < books.length; i++) {
            if (books[i].bookAuthor.equalsIgnoreCase(author)) {
                System.out.println("We stock that author in the library");
                System.out.println("Return to main menu to check which books we have");
                menu();
            } else if (i == books.length - 1) {
                System.out.println("Sorry we do not stock that book");
                System.out.println();
                menu();
            }
        }

    }
}
