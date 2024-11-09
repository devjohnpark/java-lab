package objectoriented.polymorphism.interfaces.iauth;

class AuthTest {
    public static void main(String[] args) {
        IAuthenticator IAuthenticator = new AppleIAuthenticator();

        LoginService loginService = new LoginService(AuthenticatorFactory.getAuthenticator(AuthenticatorType.Apple));
        loginService.login("john park", "devjohnpark@gmail.com");
    }
}
