package exceptionhandle.customexception.banksystem;

//public class BankAccount {
//    private double balance;
//    private boolean transactionInProgress;
//
//    {
//        transactionInProgress = false;
//    }
//
//    public BankAccount() {
//        this.balance = 0;
//    }
//
//    public BankAccount(double initialBalance) {
//        this.balance = initialBalance;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void startTransaction() {
//        if (transactionInProgress) {
//            throw new InvalidTransactionStateException(BankSystemErrorCode.TRANSACTION_ALREADY_IN_PROGRESS);
//        }
//        transactionInProgress = true;
//    }
//
//    public void endTransaction() {
//        if (!transactionInProgress) {
//            throw new InvalidTransactionStateException(BankSystemErrorCode.NO_TRANSACTION_IN_PROGRESS);
//        }
//        transactionInProgress = false;
//    }
//
//    public void deposit(double amount) throws InvalidUserInputException {
//        if (amount <= 0) {
//            throw new InvalidUserInputException(BankSystemErrorCode.INVALID_DEPOSIT_AMOUNT);
//        }
//        balance += amount;
//    }
//
//    public void withdraw(double amount) throws InvalidUserInputException, InsufficientFundsException {
//        if (amount <= 0) {
//            throw new InvalidUserInputException(BankSystemErrorCode.INVALID_WITHDRAWAL_AMOUNT);
//        }
//        if (amount > balance) {
//            throw new InsufficientFundsException(BankSystemErrorCode.INSUFFICIENT_FUNDS);
//        }
//        balance -= amount;
//    }
//}

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

