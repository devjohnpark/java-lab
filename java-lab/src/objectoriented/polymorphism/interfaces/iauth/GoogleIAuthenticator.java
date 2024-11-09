package objectoriented.polymorphism.interfaces.iauth;

class GoogleIAuthenticator implements IAuthenticator {
    @Override
    public void authenticate(String username, String useremail) {
        googleAuthenticate(username, useremail);
    }

    private void googleAuthenticate(String username, String useremail) {
        // 구글 계정 인증 조회 로직
        System.out.println("Authentificate Google Account With " + username + " and " + useremail);
    }
}