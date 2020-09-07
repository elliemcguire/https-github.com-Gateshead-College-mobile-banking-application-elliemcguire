package songs;

import java.util.Scanner;

public class BottleSong {
    Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        BottleSong bottleSong = new BottleSong();
        bottleSong.sing();
    }

    private void sing() {
        System.out.println("How many bottles of beer are there on the wall?");
        int bottles = Integer.parseInt(scanner.nextLine());

        String word = "bottles";
        for(int i = bottles; i > 0; i--){
            System.out.println(i + " " + word + " of beer on the wall,");
            System.out.println(i + " " + word + " of beer.");
            System.out.println("Take one down");
            System.out.println("Pass it around");
            if(i ==1){
                System.out.print("No more bottles of beer on the wall.");
            }
            else {
                int newNum = i-1;
                if(newNum == 1) {
                    word = "bottle";
                    newNum = newNum -1;
                }
                System.out.println(newNum + " " + word + " of beer of the wall.");
                System.out.println();
            }
        }
    }
}






