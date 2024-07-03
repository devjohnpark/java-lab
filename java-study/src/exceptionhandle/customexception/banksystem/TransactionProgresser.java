package exceptionhandle.customexception.banksystem;

public class TransactionProgresser {
    private boolean transactionInProgress;

    {
        this.transactionInProgress = false;
    }

    private boolean isTransactionInProgress() {
        return transactionInProgress;
    }

    private void setTransactionInProgress() {
        this.transactionInProgress = !transactionInProgress;
    }

    public void startTransaction() throws InvalidTransactionStateException {
        if (isTransactionInProgress()) {
            throw new InvalidTransactionStateException(BankSystemErrorCode.TRANSACTION_ALREADY_IN_PROGRESS);
        }
        setTransactionInProgress();
        System.out.println("Transaction started.");
    }

    public void endTransaction() throws InvalidTransactionStateException {
        if (!isTransactionInProgress()) {
            throw new InvalidTransactionStateException(BankSystemErrorCode.NO_TRANSACTION_IN_PROGRESS);
        }
        setTransactionInProgress();
        System.out.println("Transaction ended.");
    }
}
