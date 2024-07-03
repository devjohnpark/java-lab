package exceptionhandle.customexception.banksystem;

public class BankSystemController {
    private TransactionService transactionService;
    private TransactionStateManager transactionStateManager;

    public BankSystemController(TransactionService transactionService, TransactionStateManager transactionStateManager) {
        this.transactionService = transactionService;
        this.transactionStateManager = transactionStateManager;
    }

    public void handleDeposit(double amount) {
        try {
            transactionStateManager.startTransaction();  // 트랜잭션 시작
        } finally {
            if (transactionStateManager.isTransactionInProgress()) {
                transactionStateManager.endTransaction();  // 트랜잭션 종료
            }
        }

        try {
            transactionService.deposit(amount);
        } catch (InvalidUserInputException e) {
            e.printStackTrace();
        }
    }

    public void handleWithdraw(double amount) {
        try {
            transactionStateManager.startTransaction();  // 트랜잭션 시작
        } finally {
            if (transactionStateManager.isTransactionInProgress()) {
                transactionStateManager.endTransaction();  // 트랜잭션 종료
            }
        }

        try {
            transactionService.withdraw(amount);
        } catch (InvalidUserInputException e) {
            e.printStackTrace();
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
    }
}
