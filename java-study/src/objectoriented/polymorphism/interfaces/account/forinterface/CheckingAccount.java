package objectoriented.polymorphism.interfaces.account.forinterface;

class CheckingAccount implements Account {
    protected double balance; // 잔고
    protected double transactionLimit; // 거래 한도

    public CheckingAccount(double balance) {
        this.balance = balance;
        this.transactionLimit = 1000.0; // 기본 거래 한도 설정
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into Checking Account. New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > transactionLimit) {
            System.out.println("Transaction amount exceeds the limit for Checking Account.");
        } else {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew " + amount + " from Checking Account. New balance: " + balance);
            } else {
                System.out.println("Insufficient funds in Checking Account.");
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
