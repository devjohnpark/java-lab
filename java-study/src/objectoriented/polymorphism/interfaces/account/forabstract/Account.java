package objectoriented.polymorphism.interfaces.account.forabstract;

abstract class Account {
    protected double balance; // 잔고
    protected double transactionLimit; // 거래 한도

    public Account(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // 변경된 withdraw 메서드 - 추가 수수료 부과
    public void withdraw(double amount, double fee) {
        if (balance >= (amount + fee)) {
            balance -= (amount + fee);
            System.out.println("Withdrew " + amount + " with a fee of " + fee + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal and fee.");
        }
    }

    public double getTransactionLimit() {
        return transactionLimit;
    }

    public void setTransactionLimit(double transactionLimit) {
        this.transactionLimit = transactionLimit;
    }
}