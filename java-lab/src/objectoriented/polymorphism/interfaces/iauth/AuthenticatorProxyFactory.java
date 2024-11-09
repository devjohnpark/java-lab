package objectoriented.polymorphism.interfaces.iauth;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class AuthenticatorProxyFactory {

    private static IAuthenticator authenticator;

    public static IAuthenticator getAuthenticator(AuthenticatorType authenticatorType) {
        switch (authenticatorType) {
            case Apple:
                authenticator = new AppleIAuthenticator();
                break;
            case Google:
                authenticator = new GoogleIAuthenticator();
                break;
            case Facebook:
                authenticator = new FacebookIAuthenticator();
                break;
            default:
                throw new IllegalArgumentException("Unknown IAuthenticator type: " + authenticatorType);
        }
        return new AuthenticatorProxy(authenticator);
    }
}
