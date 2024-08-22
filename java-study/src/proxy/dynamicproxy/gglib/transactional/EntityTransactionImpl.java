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

    public void commit() {
        if (active) {
            System.out.println("=========>Transaction committed");
            try {
                connection.commit();
                active = false;
            } catch (SQLException e) {
                if (isAutoRollback) { rollback(); }
                else { throw new RuntimeException(e); }
            } finally {
                resetAutoCommit();
            }
        }
    }

    public void rollback() {
        if (active) {
            System.out.println("=========>Transaction rolled back");
            try {
                connection.rollback();
                active = false;
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void resetAutoCommit() {
        System.out.println("=========>Reset Auto Commit");
        try {
            connection.setAutoCommit(true);
            closeConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void closeConnection() {
        System.out.println("=========>Close DB Connection");
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isActive() {
        return active;
    }
}
