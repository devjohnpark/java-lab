package objectoriented.polymorphism.interfaces.login;

import objectoriented.polymorphism.interfaces.auth.Auth;

// 로그인 서비스를 제공하는 클래스
public class LoginService {
//    private final AppleAuth appleAuth;
//    private final GoogleAuth googleAuth;

//    private IAuth auth;
    private Auth auth;

    public LoginService(Auth auth) {
        this.auth = auth;
//        this.googleAuth = new GoogleAuth();
    }

    void checkAuth() {
        auth.checkAuth();
//        if (auth instanceof AppleAuth) {
//            AppleAuth appleAuth = (AppleAuth) auth;
//            appleAuth.checkAuth();
//        } else if (auth instanceof GoogleAuth) {
//            GoogleAuth googleAuth = (GoogleAuth) auth;
//            googleAuth.checkAuth();
//        }
    }
}
