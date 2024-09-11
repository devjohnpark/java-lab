package proxy.dynamicproxy.gglib.transactional;

import java.sql.Connection;
import java.sql.SQLException;

public class EntityTransactionImpl implements EntityTransaction {

    private final Connection connection;
    private boolean active;
    private boolean isAutoRollback = true;

    public EntityTransactionImpl(Connection connection) {
        this.connection = connection;
    }

    public void begin() {
        System.out.println("=========>Transaction started");
        try {
            connection.setAutoCommit(false);
            active = true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void commit() throws RuntimeException {
        System.out.println("=========>Transaction committed");
        try {
            connection.commit();
            connection.setAutoCommit(true);
            active = false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void rollback() {
        System.out.println("=========>Transaction rolled back");
        try {
            connection.rollback();
            connection.setAutoCommit(true);
            active = false;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isActive() {
        return active;
    }

    public Connection retrieveConnection() {
        System.out.println("=========>Retreive DB Connection");
        return connection;
    }

}
