package designpattern.proxy.dynamicproxy.gglib.transactional;

//import designpattern.proxy.dynamicproxy.jdk.EntityManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

    private final String url;
    private final String username;
    private final String password;

    public ConnectionProvider(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw e;
        }
    }
}
