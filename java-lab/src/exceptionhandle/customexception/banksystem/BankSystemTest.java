package exceptionhandle.customexception.banksystem;

public class BankSystemTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);
        Transactor transactor = new Transactor();
        TransactionProgresser transactionProgresser = new TransactionProgresser();
        TransactionService transactionService = new TransactionService(transactionProgresser, transactor);

//        // 정상 실행
//        transactionService.performDeposit(bankAccount, 50);
//        transactionService.performWithdraw(bankAccount, 30);
//
//        try {
//            transactionService.performDepositRuntimeExceptionHandling(bankAccount, 50);
//        } catch (InvalidUserInputException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            transactionService.performWithdrawRuntimeExceptionHandling(bankAccount, 30);
//        } catch (InvalidUserInputException e) {
//           e.printStackTrace();
//        } catch (InsufficientFundsException e) {
//            e.printStackTrace();
//        }

//         Checked Exception 발생
//        transactionService.performWithdraw(bankAccount, -20); // 음수 출금 예외
//        transactionService.performDeposit(bankAccount, -50); // 음수 입금 예외
//        transactionService.performWithdraw(bankAccount, 200); // 잔고가 100인데 200을 출급하여 예외


//        try {
//            transactionService.performWithdraw(bankAccount, -20); // 음수 출금 예외
//        } catch (InvalidUserInputException e) {
//            e.printStackTrace();
//        } catch (InsufficientFundsException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            transactionService.performDeposit(bankAccount, -50); // 음수 입금 예외
//        } catch (InvalidUserInputException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            transactionService.performWithdraw(bankAccount, 200); // 잔고가 100인데 200을 출급하여 예외
//        } catch (InvalidUserInputException e) {
//            e.printStackTrace();
//        } catch (InsufficientFundsException e) {
//            e.printStackTrace();
//        }


        // 스레드 풀 생성
        int threadCount = 3;
        Thread[] threads = new Thread[threadCount];

        // 각 스레드에서 트랜잭션 수행
        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(() -> {

                // 정상 실행
//                transactionService.performDeposit(bankAccount, 50);
//                transactionService.performWithdraw(bankAccount, 30);


                try {
                    transactionService.performDeposit(bankAccount, 50);
                } catch (InvalidUserInputException e) {
                    e.printStackTrace();
                }

                try {
                    transactionService.performWithdraw(bankAccount, 30);
                } catch (InvalidUserInputException e) {
                    e.printStackTrace();
                } catch (InsufficientFundsException e) {
                    e.printStackTrace();
                }

            });
            threads[i].start();
        }

        // 스레드 종료 대기
        for (int i = 0; i < threadCount; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
