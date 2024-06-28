package objectoriented.polymorphism.interfaces.account.forabstract;

class SavingAccount extends Account {
    public SavingAccount(double balance) {
        super(balance);
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
            withdraw(amount, 1.0); // 추가된 수수료 로직 사용
        }
    }
}
