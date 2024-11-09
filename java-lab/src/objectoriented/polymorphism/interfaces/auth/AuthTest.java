package objectoriented.polymorphism.interfaces.auth;

class AuthTest {
    public static void main(String[] args) {
        Authenticator authenticator = new AppleAuthenticator();
        LoginService loginService = new LoginService(authenticator);
        loginService.login("john park", "devjohnpark@gmail.com");
    }
}
