package objectoriented.polymorphism.interfaces.iauth;

class LoginService {
    private final IAuthenticator authenticator;

    public LoginService(IAuthenticator authenticator) {
        this.authenticator = authenticator;
    }

    public void login(String username, String useremail) {
        authenticator.authenticate(username, useremail);
        // 나머지 로그인 로직
    }

    public IAuthenticator getAuthenticator() {
        return authenticator;
    }
}
