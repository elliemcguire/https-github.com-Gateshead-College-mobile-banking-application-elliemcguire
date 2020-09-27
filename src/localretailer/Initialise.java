package localretailer;

import java.util.ArrayList;

public class Initialise {

    public ArrayList<localretailer.User> seedData() {
        ArrayList<localretailer.User> users = new ArrayList<>();
        users.add(new User("elliemcguire", "password", "ellie",
                "mcguire", new ArrayList<>()));
        users.add(new User("deanlewis", "pa$$word", "dean",
                "lewis", new ArrayList<>()));
        return users;
    }

//    private ArrayList<Bananas> bananasArrayList() {
//        ArrayList<Bananas> bananas = new ArrayList<>();
//        bananas.add(new Bananas("Banana", "3.00", 1, 40));
//        bananas.add(new Bananas("Banana", "1.50", 2, 45));
//        bananas.add(new Bananas("Banana", "2.00", 3,50));
//        return bananas;
//    }

//    private ArrayList<Oranges> orangesArrayList() {
//        ArrayList<Oranges> oranges = new ArrayList<>();
//        oranges.add(new Oranges("£2.50", 4, 51));
//        oranges.add(new Oranges("£2.75", 5, 63));
//        oranges.add(new Oranges("£1.99", 6, 55));
//        return oranges;
//    }
//
//    private ArrayList<Apples> applesArrayList() {
//        ArrayList<Apples> apples = new ArrayList<>();
//        apples.add(new Apples("£1.60", 7, 56));
//        apples.add(new Apples("£2.40", 8, 57));
//        apples.add(new Apples("£2.10", 9, 33));
//        return apples;
//    }

}
