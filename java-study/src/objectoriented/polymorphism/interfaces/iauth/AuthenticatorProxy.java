package objectoriented.polymorphism.interfaces.iauth;

class AuthenticatorProxy implements IAuthenticator {
    private final IAuthenticator realAuthenticator;

    public AuthenticatorProxy(IAuthenticator realAuthenticator) {
        this.realAuthenticator = realAuthenticator;
    }

    @Override
    public void authenticate(String username, String useremail) {
        // 추가 기능: 인증 전 로깅
        System.out.println(String.format("Logging: Authenticating with user: %s and email: %s .", username, useremail));

        // 실제 인증 객체에 위임
        realAuthenticator.authenticate(username, useremail);

        // 추가 기능: 인증 후 로깅
        System.out.println(String.format("Logging: Authentication completed for user: %s and email: %s .", username, useremail));
    }
}
