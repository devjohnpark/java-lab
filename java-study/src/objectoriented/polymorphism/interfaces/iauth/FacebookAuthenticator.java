package objectoriented.polymorphism.interfaces.iauth;

class FacebookAuthenticator implements IAuthenticator {
    @Override
    public void authenticate(String username, String useremail) {
        facebookAuthenticate(username, useremail);
    }

    private void facebookAuthenticate(String username, String useremail) {
        // 페이스북 계정 인증 조회 로직
        System.out.println("Authentificate Facebook Account With " + username + " and " + useremail);
    }
}
