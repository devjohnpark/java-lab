package exceptionhandle.customexception.banksystem;

public class BankSystemTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);
        TransactionStateManager transactionStateManager = new TransactionStateManager();
        TransactionService transactionService = new TransactionService(transactionStateManager);
        transactionService.performWithdraw(bankAccount, -20);
        transactionService.performDeposit(bankAccount, -50);
        transactionService.performWithdraw(bankAccount, 200);

        transactionService.performDeposit(bankAccount, 50);
        transactionService.performWithdraw(bankAccount, 30);
    }
}
