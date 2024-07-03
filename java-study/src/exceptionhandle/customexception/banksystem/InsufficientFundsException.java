package exceptionhandle.customexception.banksystem;

public class InsufficientFundsException extends BankSystemException {

    public InsufficientFundsException(BankSystemErrorCode errorCode) {
        super(errorCode);
    }
//    private BankSystemErrorCode errorCode;
//
//    public InsufficientFundsException(BankSystemErrorCode errorCode) {
//        this.errorCode = errorCode;
//    }

//    @Override
//    public void printStackTrace(PrintStream s) {
//        synchronized (s) {
//            super.printStackTrace(s);
//            s.println("    Error Code: " + errorCode.getCode());
//            s.println("    Error Message: " + errorCode.getMessage());
//        }
//    }
}

/*
exceptionhandle.customexception.banksystem.InsufficientFundsException: You do not have enough funds to complete this withdrawal.
	at exceptionhandle.customexception.banksystem.BankAccount.withdraw(BankAccount.java:46)
	at exceptionhandle.customexception.banksystem.BankSystemDemo.main(BankSystemDemo.java:28)
 */

/*
exceptionhandle.customexception.banksystem.InsufficientFundsException
Error Code: 1003
Error Message: You do not have enough funds to complete this withdrawal.
exceptionhandle.customexception.banksystem.InsufficientFundsException
	at exceptionhandle.customexception.banksystem.BankAccount.withdraw(BankAccount.java:46)
	at exceptionhandle.customexception.banksystem.BankSystemDemo.main(BankSystemDemo.java:28)
 */