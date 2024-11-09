package objectoriented.polymorphism.interfaces.account.forabstract;

class CheckingAccount extends Account {
    public CheckingAccount(double balance) {
        super(balance);
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
            withdraw(amount, 2.0); // 추가된 수수료 로직 사용
        }
    }
}