package mobilebanking;

//import javax.security.auth.login.AccountException;
//import java.lang.reflect.Array;
import java.util.ArrayList;

public class Initialise<Accounts> {

    public ArrayList<User> seedData() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("elliemcguire", "password", "ellie",
                "mcguire", seedAccountsSingle()));
        users.add(new User("maisiehire", "Password", "maisie",
                "hire", seedAccountsDouble()));
        users.add(new User("ellawalker", "p@ssword", "ella",
                "walker", new ArrayList<>()));
        users.add(new User("deanlewis", "pa$$word", "dean",
                "lewis", new ArrayList<>()));
        return users;
    }

    public ArrayList<Account> seedAccountsSingle() {
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account(0001, 100, "Current", generateTransactions()));
        return accounts;
    }

    private ArrayList<Account> seedAccountsDouble() {
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account(0002, 23.89, "Current", generateTransactions2()));
        accounts.add(new Account(003, 3174, "Savings", generateTransactions3()));
        return accounts;
    }

    public ArrayList<Transactions> generateTransactions() {
        ArrayList<Transactions> transactions = new ArrayList<>();
        transactions.add(new Transactions( "17/09/2020", "Alan", 20.0));
        transactions.add(new Transactions( "20/09/2020", "Dave", 323.0));
        transactions.add(new Transactions( "23/09/2020", "Bob", 42.0));
        return transactions;
    }

    public ArrayList<Transactions> generateTransactions2() {
        ArrayList<Transactions> transactions = new ArrayList<>();
        transactions.add(new Transactions("17/05/2020", "Gill", 55.5));
        transactions.add(new Transactions("20/05/2020", "Kath", 73.0));
        transactions.add(new Transactions("23/05/2020", "Susan", 49.0));
        return transactions;
    }

    public ArrayList<Transactions> generateTransactions3() {
        ArrayList<Transactions> transactions = new ArrayList<>();
        transactions.add(new Transactions("17/10/2020", "Paul", 55.5));
        transactions.add(new Transactions("20/10/2020", "Lyn", 73.0));
        transactions.add(new Transactions("23/10/2020", "Claire", 49.0));
        return transactions;
    }
}
