package designpattern.proxy.dynamicproxy.gglib.transactional;

import java.sql.Connection;
import java.sql.SQLException;

public class EntityManagerImpl implements EntityManager {

    private final SimpleConnectionPool dataSource;
    private EntityTransactionImpl transaction;

    public EntityManagerImpl(SimpleConnectionPool dataSource) {
        this.dataSource = dataSource;
    }

    public EntityTransaction getTransaction() throws RuntimeException {
        System.out.println("--------->getTransaction 메서드의 실제 로직 수행");
        if (this.transaction == null || !this.transaction.isActive()) {
            try {
                // 트랜잭션 생성시, Connection 확보하고 트랜잭션이 종료되면 반환
                Connection connection = dataSource.getConnection();
                this.transaction = new EntityTransactionImpl(connection);
            } catch (SQLException e) {
                throw new RuntimeException("Failed to create a new transaction due to a database error.", e);
            }
        }
        return this.transaction;
    }

    @Override
    public void persist(Object entity) {
        System.out.println("--------->persist 메서드의 실제 로직 수행");
        // SQL 문 변환 후 저장 로직
    }

    @Override
    public <T> T createQuery(String jpql, Class<T> entityType) {
        System.out.println("--------->createQuery 메서드의 실제 로직 수행");
        try {
            // 기본 생성자를 통해 새로운 인스턴스를 생성하여 반환
            return entityType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {
        dataSource.releaseConnection(transaction.retrieveConnection());
        transaction = null;
        System.out.println("--------->EntityManager has been closed the database connection.");
        // persistent 상태의 entity를 비우고 모든 entity를 detached 상태로 변경한다.
    }

    @Override
    public void clear() {
        System.out.println("--------->EntityManager has been cleared in persistence context.");
    }
}

