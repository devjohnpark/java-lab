package objectoriented.polymorphism.interfaces.iauth;

 class AuthenticatorFactory {
    public static IAuthenticator getAuthenticator(AuthenticatorType authenticatorType) {
        switch (authenticatorType) {
            case Apple:
                return new AppleIAuthenticator();
            case Google:
                return new GoogleIAuthenticator();
            case Facebook:
                return new FacebookIAuthenticator();
            default:
                throw new IllegalArgumentException("Unknown IAuthenticator type: " + authenticatorType);
        }
    }
}