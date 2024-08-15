package proxy.dynamicproxy.gglib;

import proxy.dynamicproxy.gglib.EntityManager;

import java.sql.Connection;
import java.sql.SQLException;

public class EntityManagerImpl implements EntityManager {

//    private final Connection connection;
//    private final EntityTransaction transaction;
//
//    public EntityManagerImpl(Connection connection) {
//        this.connection = connection;
//        this.transaction = new EntityTransactionImpl(connection);
//    }
//
//    public EntityTransaction getTransaction() {
//        return transaction;
//    }

//    private Connection connection;
//
//    private EntityTransaction transaction;
//
//    public EntityManagerImpl() {
//
//    }

    private final ConnectionProvider connectionProvider;
//    private EntityTransactionImpl transaction;

    public EntityManagerImpl(ConnectionProvider connectionProvider) {
        this.connectionProvider = connectionProvider;
    }

    public EntityTransaction getTransaction() {
//        if (this.transaction == null || !this.transaction.isActive()) {
//            try {
//                // 트랜잭션 생성시, Connection 확보하고 트랜잭션이 종료되면 반환
//                Connection connection = connectionProvider.getConnection();
//                this.transaction = new EntityTransactionImpl(connection);
//            } catch (SQLException e) {
//                throw new RuntimeException("Failed to create a new transaction due to a database error.", e);
//            }
//        }
//        return this.transaction;
        try {
            // 트랜잭션 생성시, Connection 확보하고 트랜잭션이 종료되면 반환
            Connection connection = connectionProvider.getConnection();
            return new EntityTransactionImpl(connection);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to create a new transaction due to a database error.", e);
        }
    }

    @Override
    public void persist(Object entity) {
        System.out.println("persist 메서드의 실제 로직 수행");
        // SQL 문 변환 후 저장 로직
    }

    @Override
    public <T> T createQuery(String jpql, Class<T> entityType) {
        System.out.println("createQuery 메서드의 실제 로직 수행");
        try {
            // 기본 생성자를 통해 새로운 인스턴스를 생성하여 반환
            return entityType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null; // 예외 발생 시 null 반환 (실제로는 예외 처리를 다르게 할 수 있음)
        }
    }

    @Override
    public void close() {
        System.out.println("EntityManager 닫기");
//        transaction = null;
        // persistent 상태의 entity를 비우고 모든 entity를 detached 상태로 변경한다.
    }
}

