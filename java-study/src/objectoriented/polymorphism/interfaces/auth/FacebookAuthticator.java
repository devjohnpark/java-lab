package objectoriented.polymorphism.interfaces.auth;

class FacebookAuthticator extends Authenticator {
    @Override
    public void authenticate(String username, String useremail) {
        // 페이스북 계정 인증 조회 로직
        System.out.println("Authentificate Facebook Account With " + username + " and " + useremail);
    }
}
