package objectoriented.polymorphism.interfaces.auth;

// 애플 권한에 대한 기능을 수행하는 클래스
public class AppleAuthenticator extends Authenticator {
    @Override
    public void authenticate(String username, String useremail) {
        // 애플 계정 인증 조회 로직
        System.out.println("Authentificate Apple Account With " + username + " and " + useremail);
    }
}
