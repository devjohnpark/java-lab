package objectoriented.polymorphism.interfaces.iauth;

class LoginService {
    private final IAuthenticator IAuthenticator;

    public LoginService(IAuthenticator IAuthenticator) {
        this.IAuthenticator = IAuthenticator;
    }

    public void login(String username, String useremail) {
        IAuthenticator.authenticate(username, useremail);
        // 나머지 로그인 로직
    }

    public IAuthenticator getAuthenticator() {
        return IAuthenticator;
    }
}
