package exceptionhandle.customexception.banksystem;

//public enum BankSystemErrorCode {
//    INVALID_DEPOSIT_AMOUNT(1001),
//    INVALID_WITHDRAWAL_AMOUNT(1002),
//    INSUFFICIENT_FUNDS(1003),
//    TRANSACTION_ALREADY_IN_PROGRESS(6001),
//    NO_TRANSACTION_IN_PROGRESS(6002);
//    UNKNOWN_ERROR(9999, "An unknown error occurred.");
//
//    private final int code;
//
//    BankSystemErrorCode(int code) {
//        this.code = code;
//    }
//
//    public int getCode() {
//        return code;
//    }
//
//    public void printBankSystemErrorCode() {
//        // 에러 코드에 따라 다른 메시지를 사용자에게 노출
//        switch (getCode()) {
//            case 1003:
//                System.out.println("You do not have enough funds to complete this withdrawal.");
//                break;
//            default:
//                System.out.println("An unknown error occurred related to funds.");
//                break;
//        }
//        System.out.println();
//    }
//}

public enum BankSystemErrorCode {
    INVALID_DEPOSIT_AMOUNT(1001, "Please enter a positive amount for deposit."),
    INVALID_WITHDRAWAL_AMOUNT(1002, "Please enter a positive amount for withdrawal."),
    INSUFFICIENT_FUNDS(1003, "You do not have enough funds to complete this withdrawal."),
    TRANSACTION_ALREADY_IN_PROGRESS(6001, "A transaction is already in progress. Please complete it before starting a new one."),
    NO_TRANSACTION_IN_PROGRESS(6002, "No transaction is currently in progress to end."),
    UNKNOWN_ERROR(9999, "An unknown error occurred.");

    private final int code;
    private final String message;

    BankSystemErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
