package proxy.dynamicproxy.gglib.transactional;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Queue;

public class SimpleConnectionPool {

    private final String url;
    private final String username;
    private final String password;
    private final int maxPoolSize;
    private final Queue<Connection> pool;

    public SimpleConnectionPool(String url, String username, String password, int maxPoolSize) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.maxPoolSize = maxPoolSize;
        this.pool = new LinkedList<>();
    }

    // 커넥션을 가져오는 메서드
    public synchronized Connection getConnection() throws SQLException {
        if (pool.isEmpty() && pool.size() < maxPoolSize) {
            return DriverManager.getConnection(url, username, password);
        } else {
            return pool.poll();
        }
    }

    // 커넥션을 반환하는 메서드
    public synchronized void releaseConnection(Connection connection) {
        if (connection != null && pool.size() < maxPoolSize) {
            pool.offer(connection);
        } else {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // 모든 커넥션을 닫는 메서드
    public synchronized void closeAllConnections() {
        while (!pool.isEmpty()) {
            try {
                pool.poll().close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
