package objectoriented.polymorphism.interfaces.iauth;

public class Client {
    public static void main(String[] args) {
        LoginService loginService1 = new LoginService(AuthenticatorProxyFactory.getAuthenticator(AuthType.Apple));
        loginService1.login("john park", "devjohnpark@gmail.com");

        LoginService loginService2 = new LoginService(AuthenticatorProxyFactory.getAuthenticator(AuthType.Apple));
        loginService2.login("john park", "devjohnpark@gmail.com");

        System.out.println("Authentificator Object Inner Address of loginService1: " + loginService1.getAuthenticator());
        System.out.println("Authentificator Object Inner Address of loginService2: " + loginService2.getAuthenticator());
    }
}
