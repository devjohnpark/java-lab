package exceptionhandle.customexception.banksystem;

public class InsufficientFundsException extends BankSystemException {

    public InsufficientFundsException(BankSystemErrorCode errorCode) {
        super(errorCode);
    }
}