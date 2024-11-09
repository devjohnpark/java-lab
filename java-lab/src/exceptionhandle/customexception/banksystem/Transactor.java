package exceptionhandle.customexception.banksystem;

public class Transactor {
    public void deposit(BankAccount bankAccount, double amount) throws InvalidUserInputException {
        if (amount <= 0) {
            throw new InvalidUserInputException(BankSystemErrorCode.INVALID_DEPOSIT_AMOUNT);
        }
        bankAccount.updateBalance(amount);
        System.out.println("Deposited " + amount);
    }

    public void withdraw(BankAccount bankAccount, double amount) throws InvalidUserInputException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidUserInputException(BankSystemErrorCode.INVALID_WITHDRAWAL_AMOUNT);
        }
        if (amount > bankAccount.getBalance()) {
            throw new InsufficientFundsException(BankSystemErrorCode.INSUFFICIENT_FUNDS);
        }
        bankAccount.updateBalance(-amount);
        System.out.println("Withdrew " + amount);
    }
}
