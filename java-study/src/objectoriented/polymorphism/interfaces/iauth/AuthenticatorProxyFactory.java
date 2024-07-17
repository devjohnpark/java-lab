package objectoriented.polymorphism.interfaces.iauth;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class AuthenticatorProxyFactory {
    private static final ConcurrentMap<AuthType, IAuthenticator> authenticators = new ConcurrentHashMap<>();

    public static IAuthenticator getAuthenticator(AuthType authType) {
        return authenticators.computeIfAbsent(authType, key -> {
            IAuthenticator authenticator;
            switch (key) {
                case Apple:
                    authenticator = new AppleAuthenticator();
                    break;
                case Google:
                    authenticator = new GoogleAuthenticator();
                    break;
                case Facebook:
                    authenticator = new FacebookAuthenticator();
                    break;
                default:
                    throw new IllegalArgumentException("Unknown Authenticator type: " + key);
            }
            return new AuthenticatorProxy(authenticator);
        });
    }
}
