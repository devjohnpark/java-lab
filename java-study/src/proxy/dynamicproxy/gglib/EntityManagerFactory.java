package proxy.dynamicproxy.gglib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//public class EntityManagerFactory {
//    private ConnectionProvider connectionProvider = new ConnectionProvider( "jdbc:h2:tcp://localhost/~/test", "sa", null);
//
//    public static EntityManager createEntityManager() {
//        return new EntityManagerImpl();
//    }
//
//    public Connection getConnection() {
//        try {
//            return connectionProvider.getConnection();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}

//public class EntityManagerFactory {
//
//
//    private final ConnectionProvider connectionProvider;
//
//    public EntityManagerFactory(String url, String username, String password) {
//        this.connectionProvider = new ConnectionProvider(url, username, password);
//    }
//
//    public EntityManager createEntityManager() {
//        return new EntityManagerImpl(connectionProvider);
//    }
//
////    public void close() {
////        connectionProvider.close();
////    }
//}

public class EntityManagerFactory {

    private static EntityManagerFactory instance;
    private final ConnectionProvider connectionProvider;

    private EntityManagerFactory(String url, String username, String password) {
        this.connectionProvider = new ConnectionProvider(url, username, password);
    }

    public static synchronized EntityManagerFactory getInstance(String url, String username, String password) {
        if (instance == null) {
            instance = new EntityManagerFactory(url, username, password);
        }
        return instance;
    }

    public EntityManager createEntityManager() {
        return new EntityManagerImpl(connectionProvider);
    }
}
