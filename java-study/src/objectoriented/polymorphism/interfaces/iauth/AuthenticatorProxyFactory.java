package objectoriented.polymorphism.interfaces.iauth;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class AuthenticatorProxyFactory {
    private static final ConcurrentMap<AuthenticatorType, IAuthenticator> authenticators = new ConcurrentHashMap<>();

    public static IAuthenticator getAuthenticator(AuthenticatorType authenticatorType) {
        return authenticators.computeIfAbsent(authenticatorType, key -> {
            IAuthenticator IAuthenticator;
            switch (key) {
                case Apple:
                    IAuthenticator = new AppleIAuthenticator();
                    break;
                case Google:
                    IAuthenticator = new GoogleIAuthenticator();
                    break;
                case Facebook:
                    IAuthenticator = new FacebookIAuthenticator();
                    break;
                default:
                    throw new IllegalArgumentException("Unknown IAuthenticator type: " + key);
            }
            return new AuthenticatorProxy(IAuthenticator);
        });
    }
}
