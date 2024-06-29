package objectoriented.polymorphism.interfaces.iauth;

class AuthTest {
    public static void main(String[] args) {
        IAuthenticator authenticator = new AppleAuthenticator();

        LoginService loginService = new LoginService(AuthManager.getAuthenticator(AuthType.Apple));
        loginService.login("john park", "devjohnpark@gmail.com");
    }
}
