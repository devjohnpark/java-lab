package exceptionhandle.customexception.banksystem;

import java.io.PrintStream;

public class InvalidUserInputException extends BankSystemException {

    public InvalidUserInputException(BankSystemErrorCode errorCode) {
        super(errorCode);
    }
}
