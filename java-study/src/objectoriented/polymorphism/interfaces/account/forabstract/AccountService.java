package objectoriented.polymorphism.interfaces.account.forabstract;

public class AccountService {
    private Account account;

    // Dependency Injection을 위한 생성자
    public AccountService(Account account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.deposit(amount);
    }

    public void withdraw(double amount) {
        account.withdraw(amount);
    }

    public void printBalance() {
        System.out.println("The current balance is " + account.getBalance());
    }

    public void setTransactionLimit(double limit) {
        account.setTransactionLimit(limit);
    }
}
