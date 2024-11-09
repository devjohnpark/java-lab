package objectoriented.modifier;

public class BankAccount {
    // private 접근 제어자를 사용하여 외부에서 직접 접근할 수 없도록 함
    private String accountNumber;
    private double balance;
    private String password;

    // 생성자를 통해 초기값 설정
    public BankAccount(String accountNumber, double initialBalance, String password) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.password = password;
    }

    // balance를 안전하게 가져오는 public 메서드
    public double getBalance(String password) {
        if (this.password.equals(password)) {
            return balance;
        } else {
            throw new SecurityException("Invalid password");
        }
    }

    // balance를 안전하게 변경하는 public 메서드
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
    }

    public void withdraw(double amount, String password) {
        if (!this.password.equals(password)) {
            throw new SecurityException("Invalid password");
        }
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient funds or invalid amount");
        }
    }

    // accountNumber를 안전하게 가져오는 public 메서드
    public String getAccountNumber() {
        return accountNumber;
    }
}
