package objectoriented.polymorphism.interfaces.iauth;

 class AuthenticatorFactory {
     private static IAuthenticator authenticator;

     public static IAuthenticator getAuthenticator(AuthenticatorType authenticatorType) {
        switch (authenticatorType) {
            case Apple:
                authenticator =  new AppleIAuthenticator();
                break;
            case Google:
                authenticator =  new GoogleIAuthenticator();
                break;
            case Facebook:
                authenticator = new FacebookIAuthenticator();
                break;
            default:
                throw new IllegalArgumentException("Unknown IAuthenticator type: " + authenticatorType);
        }
        return authenticator;
     }
}