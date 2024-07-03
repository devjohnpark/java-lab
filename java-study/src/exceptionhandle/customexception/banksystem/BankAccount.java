package exceptionhandle.customexception.banksystem;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this(0);
    }

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void updateBalance(double amount) {
        this.balance += amount;
    }
}

