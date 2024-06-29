package objectoriented.polymorphism.interfaces.iauth;

 class AuthManager {
    public static IAuthenticator getAuthenticator(AuthType authType) {
        switch (authType) {
            case Apple:
                return new AppleAuthenticator();
            case Google:
                return new GoogleAuthenticator();
            case Facebook:
                return new FacebookAuthticator();
            default:
                throw new IllegalArgumentException("Unknown Authenticator type: " + authType);
        }
    }
}