package mobilebanking;

import java.util.ArrayList;

public class Account {

    private int accountNumber;
    private double accountBalance;
    private String accountType;
    private ArrayList<Transactions> transactions;

    public Account(int accountNumber, double accountBalance, String accountType, ArrayList<Transactions> transactions) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
        this.transactions = transactions;
    }


    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) { this.accountType = accountType; }

    public ArrayList<Transactions> getTransactions() { return transactions; }
    public void setTransactions(ArrayList<Transactions> transactions) { this.transactions = transactions; }
}
