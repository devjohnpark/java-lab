package proxy.dynamicproxy.gglib.transactional;

// EntityManager에 대한 Transaction 관리
public class JpaTransactionManager {

    private final EntityManagerFactory entityManagerFactory;
    private EntityManager entityManagerInit; // EntityManager 프록시 객체
    private EntityTransaction transaction;
    private final EntityManagerHandler entityManagerHandler;

    public JpaTransactionManager(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
        this.entityManagerHandler = new EntityManagerHandler(entityManagerFactory);
    }

    public EntityManager initProxyEntityManager() {
        return entityManagerInit = JdkDynamicProxyFactory.createProxy(EntityManager.class, entityManagerHandler);
    }

    public void beginTransaction() {
        transaction = entityManagerInit.getTransaction();
        transaction.begin();
    }

    public void commitTransaction() {
        if (transaction.isActive()) {
            transaction.commit();
        }
    }

    public void rollbackTransaction() {
        if (transaction.isActive()) {
            transaction.rollback();
        }
    }

    public void closeEntityManager() {
        if (entityManagerInit != null) {
            entityManagerInit.close();
        }
    }
}