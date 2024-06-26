package objectoriented.polymorphism.interfaces.login;

import objectoriented.polymorphism.interfaces.auth.AppleAuth;

public class LoginTest {
    public static void main(String[] args) {
//        AppleAuth appleAuth = new AppleAuth();
        AppleAuth appleAuth = new AppleAuth();
        LoginService loginService = new LoginService(appleAuth);
        loginService.checkAuth();
    }
}
