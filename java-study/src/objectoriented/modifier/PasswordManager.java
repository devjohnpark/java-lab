package objectoriented.modifier;

public class PasswordManager {
    // private 접근 제어자를 사용하여 외부에서 직접 접근할 수 없도록 함
    private String password;
    private int failedAttempts;

    // 생성자를 통해 초기값 설정
    public PasswordManager(String initialPassword) {
        this.password = initialPassword;
        this.failedAttempts = 0;
    }

    // 비밀번호 변경을 위한 public 메서드
    public void changePassword(String oldPassword, String newPassword) {
        if (verifyPassword(oldPassword)) {
            this.password = newPassword;
            resetFailedAttempts();
        } else {
            registerFailedAttempt();
            throw new SecurityException("Invalid old password");
        }
    }

    // 비밀번호 검증을 위한 private 메서드
    private boolean verifyPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    // 실패한 시도를 등록하는 private 메서드
    private void registerFailedAttempt() {
        failedAttempts++;
        if (failedAttempts >= 3) {
            lockAccount();
        }
    }

    // 실패한 시도 카운트를 초기화하는 private 메서드
    private void resetFailedAttempts() {
        failedAttempts = 0;
    }

    // 계정을 잠그는 private 메서드
    private void lockAccount() {
        // 실제로는 더 복잡한 잠금 로직이 들어갈 수 있음
        System.out.println("Account locked due to too many failed attempts.");
    }

    // 비밀번호 검증을 위한 public 메서드
    public boolean authenticate(String inputPassword) {
        if (verifyPassword(inputPassword)) {
            resetFailedAttempts();
            return true;
        } else {
            registerFailedAttempt();
            return false;
        }
    }
}

