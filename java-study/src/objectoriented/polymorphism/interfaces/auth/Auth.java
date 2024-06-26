package objectoriented.polymorphism.interfaces.auth;

public abstract class Auth {
    public void checkAuth() {
        // 애플 계정 권한 조회 로직
        System.out.println("Check auth with appleID");
    }
}
