package objectoriented.polymorphism.interfaces.auth;

// 구글 권한에 대한 기능을 수행하는 클래스
class GoogleAuthenticator extends Authenticator {
    @Override
    public void authenticate(String username, String useremail) {
        // 구글 계정 인증 조회 로직
        System.out.println("Authentificate Google Account With " + username + " and " + useremail);
    }
}