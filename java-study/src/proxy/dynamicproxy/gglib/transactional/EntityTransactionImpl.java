package proxy.dynamicproxy.gglib.transactional;

import java.sql.Connection;
import java.sql.SQLException;

public class EntityTransactionImpl implements EntityTransaction {

    private final Connection connection;
    private boolean active;

    public EntityTransactionImpl(Connection connection) {
        this.connection = connection;
    }

    public void begin() {
        System.out.println("=========>Transaction started");
        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        active = true;
    }

    public void commit() throws RuntimeException {
        if (active) {
            System.out.println("=========>Transaction committed");
            try {
                connection.commit();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                resetAutoCommit();
            }
            active = false;
        }
    }

    public void rollback() {
        if (active) {
            System.out.println("=========>Transaction rolled back");
            try {
                connection.rollback();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                resetAutoCommit();
            }
            active = false;
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
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("=========>Close DB Connection");
    }

    public boolean isActive() {
        return active;
    }
}
