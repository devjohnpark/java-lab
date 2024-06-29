package objectoriented.polymorphism.interfaces.auth;

class LoginService {
    private Authenticator authenticator;

    public LoginService(Authenticator authenticator) {
        this.authenticator = authenticator;
    }

    public void login(String username, String useremail) {
        authenticator.authenticate(username, useremail);
        // 나머지 로그인 로직

//        switch (authenticator) {
//            case a
//        }
//
//        switch (databaseType) {
//            case Mysql:
//                return new MySQLDataBaseClient();
//            case Postresql:
//                return new PostgreSQLDataBaseClient();
//            default:
//                throw new IllegalArgumentException("Unknown Database type: " + databaseType);
//        }
    }

}
