package objectoriented.modifier;

public class PasswordManagerTest {
    public static void main(String[] args) {
        PasswordManager manager = new PasswordManager("initialPassword");

        // 비밀번호 검증
        System.out.println(manager.authenticate("wrongPassword")); // false
        System.out.println(manager.authenticate("wrongPassword")); // false
        System.out.println(manager.authenticate("wrongPassword")); // false, Account locked due to too many failed attempts.

        // 비밀번호 변경 시도
        try {
            manager.changePassword("wrongPassword", "newPassword"); // Exception 발생
        } catch (SecurityException e) {
            System.out.println(e.getMessage()); // Invalid old password
        }

        // 비밀번호 변경 성공
        manager.changePassword("initialPassword", "newPassword");
        System.out.println(manager.authenticate("newPassword")); // true
    }
}