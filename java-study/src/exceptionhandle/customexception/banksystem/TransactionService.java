package exceptionhandle.customexception.banksystem;

public class TransactionService {
    private TransactionStateManager transactionManager;

    public TransactionService(TransactionStateManager transactionManager) {
        this.transactionManager = transactionManager;
    }

    private void deposit(BankAccount bankAccount, double amount) throws InvalidUserInputException {
        if (amount <= 0) {
            throw new InvalidUserInputException(BankSystemErrorCode.INVALID_DEPOSIT_AMOUNT);
        }
        bankAccount.updateBalance(amount);
        System.out.println("Deposited " + amount);
    }

    private void withdraw(BankAccount bankAccount, double amount) throws InvalidUserInputException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidUserInputException(BankSystemErrorCode.INVALID_WITHDRAWAL_AMOUNT);
        }
        if (amount > bankAccount.getBalance()) {
            throw new InsufficientFundsException(BankSystemErrorCode.INSUFFICIENT_FUNDS);
        }
        bankAccount.updateBalance(-amount);
        System.out.println("Withdrew " + amount);
    }

    public void performDeposit(BankAccount bankAccount, double amount) {
        try {
            transactionManager.startTransaction();
            deposit(bankAccount, amount);
        } catch (InvalidUserInputException e) {
            e.printStackTrace();
        } finally {
            transactionManager.endTransaction();
        }
    }

    public void performWithdraw(BankAccount bankAccount, double amount) {
        try {
            transactionManager.startTransaction();
            withdraw(bankAccount, amount);
        } catch (InvalidUserInputException e) {
            e.printStackTrace();
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        } finally {
            transactionManager.endTransaction();
        }
    }
}
