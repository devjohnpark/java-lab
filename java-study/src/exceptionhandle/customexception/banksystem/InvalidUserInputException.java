package exceptionhandle.customexception.banksystem;

import java.io.PrintStream;

public class InvalidUserInputException extends BankSystemException {

    public InvalidUserInputException(BankSystemErrorCode errorCode) {
        super(errorCode);
    }
//    private BankSystemErrorCode errorCode;
//
//    public InvalidUserInputException(BankSystemErrorCode errorCode) {
//        this.errorCode = errorCode;
//    }
//
//    @Override
//    public void printStackTrace(PrintStream s) {
//        synchronized (s) {
//            super.printStackTrace(s);
//            s.println("    Error Code: " + errorCode.getCode());
//            s.println("    Error Message: " + errorCode.getMessage());
//        }
//    }
}
