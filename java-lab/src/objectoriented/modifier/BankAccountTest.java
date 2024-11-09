package objectoriented.modifier;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 1000.0, "securePassword");

        // 유효한 비밀번호로 잔액 조회
        System.out.println("Balance: " + account.getBalance("securePassword")); // Balance: 1000.0

        // 비밀번호가 유효하지 않으면 SecurityException 발생
        // System.out.println(account.getBalance("wrongPassword")); // Exception 발생

        // 예금을 통해 잔액 증가
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance("securePassword")); // Balance after deposit: 1500.0

        // 출금을 통해 잔액 감소 (유효한 비밀번호 필요)
        account.withdraw(200.0, "securePassword");
        System.out.println("Balance after withdrawal: " + account.getBalance("securePassword")); // Balance after withdrawal: 1300.0
    }
}
