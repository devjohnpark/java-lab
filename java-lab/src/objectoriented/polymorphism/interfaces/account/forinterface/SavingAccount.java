package objectoriented.polymorphism.interfaces.account.forinterface;

class SavingAccount implements Account {
    protected double balance; // 잔고
    protected double transactionLimit; // 거래 한도

    public SavingAccount(double balance) {
        this.balance = balance;
        this.transactionLimit = 500.0; // 기본 거래 한도 설정
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into Savings Account. New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > transactionLimit) {
            System.out.println("Transaction amount exceeds the limit for Savings Account.");
        } else {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew " + amount + " from Savings Account. New balance: " + balance);
            } else {
                System.out.println("Insufficient funds in Savings Account.");
            }
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setTransactionLimit(double limit) {
        this.transactionLimit = limit;
    }

    @Override
    public double getTransactionLimit() {
        return transactionLimit;
    }
}