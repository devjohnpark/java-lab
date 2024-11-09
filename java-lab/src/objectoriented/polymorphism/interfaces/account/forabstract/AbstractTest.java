package objectoriented.polymorphism.interfaces.account.forabstract;

public class AbstractTest {
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

        // 변경된 거래 한도가 하위 클래스의 상태에 영향을 미침
        checkingService.setTransactionLimit(50.0);
        checkingService.withdraw(60); // 거래 한도 초과로 실패

        savingsService.setTransactionLimit(20.0);
        savingsService.withdraw(25); // 거래 한도 초과로 실패


//        Account checking = new CheckingAccount(100);
//        Account savings = new SavingAccount(100);
//
//        checking.deposit(50);
//        checking.withdraw(30); // 출금
//        checking.withdraw(130); // 출금 실패
//
//        savings.deposit(50);
//        savings.withdraw(30); // 출금
//        savings.withdraw(120); // 출금 실패
//
//        // 변경된 거래 한도가 하위 클래스의 상태에 영향을 미침
//        checking.setTransactionLimit(50.0);
//        checking.withdraw(60); // 거래 한도 초과로 실패
//
//        savings.setTransactionLimit(20.0);
//        savings.withdraw(25); // 거래 한도 초과로 실패
    }
}

/*
Deposited 50.0 into Checking Account. New balance: 150.0
Withdrew 30.0 with a fee of 2.0. New balance: 118.0
Insufficient funds for withdrawal and fee.
Deposited 50.0 into Savings Account. New balance: 150.0
Withdrew 30.0 with a fee of 1.0. New balance: 119.0
Insufficient funds for withdrawal and fee.
Transaction amount exceeds the limit for Checking Account.
Transaction amount exceeds the limit for Savings Account.

Deposited 50.0 into Checking Account. New balance: 150.0
Withdrew 30.0 from Checking Account. New balance: 120.0
Insufficient funds in Checking Account.
Deposited 50.0 into Savings Account. New balance: 150.0
Withdrew 30.0 from Savings Account. New balance: 120.0
Withdrew 120.0 from Savings Account. New balance: 0.0
Transaction amount exceeds the limit for Checking Account.
Transaction amount exceeds the limit for Savings Account.
 */