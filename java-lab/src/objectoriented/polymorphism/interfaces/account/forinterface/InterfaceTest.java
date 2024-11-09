package objectoriented.polymorphism.interfaces.account.forinterface;

public class InterfaceTest {
    public static void main(String[] args) {
        // CheckingAccount 객체 주입
        Account checkingAccount = new CheckingAccount(100);
        AccountService checkingService = new AccountService(checkingAccount);

        checkingService.deposit(50);
        checkingService.withdraw(30); // 출금
        checkingService.withdraw(130); // 출금 실패

        // SavingsAccount 객체 주입
        Account savingsAccount = new SavingAccount(100);
        AccountService savingsService = new AccountService(savingsAccount);

        savingsService.deposit(50);
        savingsService.withdraw(30); // 출금
        savingsService.withdraw(120); // 출금 실패

        checkingService.setTransactionLimit(50.0);
        checkingService.withdraw(60); // 거래 한도 초과로 실패

        savingsService.setTransactionLimit(20.0);
        savingsService.withdraw(25); // 거래 한도 초과로 실패
    }
}
