package proxy.dynamicproxy.gglib.transactional;

// EntityManager에 대한 Transaction 관리
public class JpaTransactionManager {

    private final EntityManagerFactory entityManagerFactory;
    private EntityManager proxyEntityManager; // EntityManager 프록시 객체
    private EntityTransaction transaction;
    private final EntityManagerHandler entityManagerHandler;
    private boolean isAutoRollback = true;

    public JpaTransactionManager(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
        this.entityManagerHandler = new EntityManagerHandler(entityManagerFactory);
    }

    public EntityManager initProxyEntityManager() {
        return proxyEntityManager = JdkDynamicProxyFactory.createProxy(EntityManager.class, entityManagerHandler);
    }

    public void beginTransaction() {
        transaction = proxyEntityManager.getTransaction();
        transaction.begin();
    }

    public void commitTransaction() {
        if (transaction.isActive()) {
            try {
                transaction.commit();
            } catch (RuntimeException e) {
                if (isAutoRollback) { rollbackTransaction(); }
                else { throw e; }
            } finally {
                closeEntityManager();
            }
        }
    }

    public void rollbackTransaction() {
        if (transaction.isActive()) {
            transaction.rollback();
        }
    }

    public void closeEntityManager() {
        if (proxyEntityManager != null) {
            proxyEntityManager.close();
            proxyEntityManager.clear();
        }
    }
}