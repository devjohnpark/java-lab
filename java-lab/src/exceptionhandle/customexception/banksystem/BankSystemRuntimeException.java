package exceptionhandle.customexception.banksystem;

import java.io.PrintStream;

public class BankSystemRuntimeException extends RuntimeException {
    private BankSystemErrorCode errorCode;

    public BankSystemRuntimeException(BankSystemErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public void printStackTrace(PrintStream s) {
        synchronized (s) {
            super.printStackTrace(s);
            s.println("    Error Code: " + errorCode.getCode());
            s.println("    Error Message: " + errorCode.getMessage());
        }
    }
}
