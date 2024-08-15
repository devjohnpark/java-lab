package proxy.dynamicproxy.gglib;

import java.sql.Connection;
import java.sql.SQLException;

public class EntityTransactionImpl implements EntityTransaction {

    private final Connection connection;
    private boolean active;

    public EntityTransactionImpl(Connection connection) {
        this.connection = connection;
    }

    public void begin() {
        try {
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        active = true;
        System.out.println("Transaction started");
    }

    public void commit() {
        if (active) {
            try {
                connection.commit();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                resetAutoCommit();
            }
            active = false;
            System.out.println("Transaction committed");
        }
    }

    public void rollback() {
        if (active) {
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                resetAutoCommit();
            }
            active = false;
            System.out.println("Transaction rolled back");
        }
    }

    private void resetAutoCommit() {
        try {
            connection.setAutoCommit(true);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to reset auto-commit", e);
        }
    }

    public boolean isActive() {
        return active;
    }
}
