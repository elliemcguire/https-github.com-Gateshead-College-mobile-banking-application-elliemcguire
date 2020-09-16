package mobilebanking;

import java.util.ArrayList;

public class Initialise {

    public ArrayList<User> generateUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("ellie",  "17.05.2001", "Elliemcguire", "password"));
        return users;
    }

}
