package objectoriented.polymorphism.interfaces.iauth;

public class AppleIAuthenticator implements IAuthenticator {
    @Override
    public void authenticate(String username, String useremail) {
        appleAuthenticate(username, useremail);
    }

    private void appleAuthenticate(String username, String useremail) {
        // 애플 계정 인증 조회 로직
        System.out.println("Authentificate Apple Account With " + username + " and " + useremail);
    }
}
