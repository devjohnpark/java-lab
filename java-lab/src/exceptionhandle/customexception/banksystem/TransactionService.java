package exceptionhandle.customexception.banksystem;


public class TransactionService {
    private TransactionProgresser transactionProgresser;
    private Transactor transactor;

    public TransactionService(TransactionProgresser transactionProgresser, Transactor transactor) {
        this.transactionProgresser = transactionProgresser;
        this.transactor = transactor;
    }
//
//    public void performDeposit(BankAccount bankAccount, double amount) {
//        try {
//            transactionProgresser.startTransaction();
//            transactor.deposit(bankAccount, amount);
//        } catch (InvalidTransactionStateException e) {
//            e.printStackTrace();
//            return; // 트랜잭션 시작 실패 시 예외를 처리하고 메서드를 종료
//        } catch (InvalidUserInputException e) { // 생략 가능
//            e.printStackTrace();
//        } finally {
//            transactionProgresser.endTransaction();
//        }
//    }
//
//    public void performWithdraw(BankAccount bankAccount, double amount) {
//        try {
//            transactionProgresser.startTransaction();
//            transactor.withdraw(bankAccount, amount);
//        } catch (InvalidTransactionStateException e) {
//            e.printStackTrace();
//            return; // 트랜잭션 시작 실패 시 예외를 처리하고 메서드를 종료
//        } catch (InvalidUserInputException | InsufficientFundsException e) {
//            e.printStackTrace();
//        } finally {
//            transactionProgresser.endTransaction();
//        }
//    }

    public synchronized void performDeposit(BankAccount bankAccount, double amount) throws InvalidUserInputException {
        try (TransactionProgresser tp = transactionProgresser) {
            tp.startTransaction();
            transactor.deposit(bankAccount, amount);
        } catch (InvalidTransactionStateException e) {
            e.printStackTrace();
            return; // 트랜잭션 시작 실패 시 예외를 처리하고 메서드를 종료
        } catch (InvalidUserInputException e) { // 생략 가능
            e.printStackTrace();
        }
    }

    public synchronized void performWithdraw(BankAccount bankAccount, double amount) throws InvalidUserInputException, InsufficientFundsException {
        try (TransactionProgresser tp = transactionProgresser) {
            tp.startTransaction();
            transactor.withdraw(bankAccount, amount);
        } catch (InvalidTransactionStateException e) {
            e.printStackTrace();
            return; // 트랜잭션 시작 실패 시 예외를 처리하고 메서드를 종료
        } catch (InvalidUserInputException | InsufficientFundsException e) { // 생략 가능
            throw e;
        }
    }
}
