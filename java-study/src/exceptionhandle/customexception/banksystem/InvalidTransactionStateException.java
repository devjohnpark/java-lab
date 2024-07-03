package exceptionhandle.customexception.banksystem;

import java.io.PrintStream;

public class InvalidTransactionStateException extends BankSystemRuntimeException {
    public InvalidTransactionStateException(BankSystemErrorCode errorCode) {
        super(errorCode);
    }
}
