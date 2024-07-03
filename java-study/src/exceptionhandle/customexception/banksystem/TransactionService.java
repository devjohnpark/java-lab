package exceptionhandle.customexception.banksystem;

public class TransactionService {
    private TransactionProgresser transactioStateManager;
    private Transactor transactor;

    public TransactionService(TransactionProgresser transactioStateManager, Transactor transactor) {
        this.transactioStateManager = transactioStateManager;
        this.transactor = transactor;
    }

    public void performDeposit(BankAccount bankAccount, double amount) {
        try {
            transactioStateManager.startTransaction();
            transactor.deposit(bankAccount, amount);
        } catch (InvalidUserInputException e) {
            e.printStackTrace();
        } finally {
            transactioStateManager.endTransaction();
        }
    }

    public void performWithdraw(BankAccount bankAccount, double amount) {
        try {
            transactioStateManager.startTransaction();
            transactor.withdraw(bankAccount, amount);
        } catch (InvalidUserInputException e) {
            e.printStackTrace();
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        } finally {
            transactioStateManager.endTransaction();
        }
    }
}
