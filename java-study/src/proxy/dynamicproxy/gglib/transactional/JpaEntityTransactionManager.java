package proxy.dynamicproxy.gglib.transactional;

// EntityManager에 대한 Transaction 관리
public class JpaEntityTransactionManager {

    private final EntityManagerFactory entityManagerFactory;
    private EntityManager proxyEntityManager; // EntityManager 프록시 객체
    private EntityTransaction transaction;
    private boolean isAutoRollback = true;

    public JpaEntityTransactionManager(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public EntityManager initProxyEntityManager() {
        return proxyEntityManager = JdkDynamicProxyFactory.createProxy(EntityManager.class, new EntityManagerHandler(entityManagerFactory));
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

    public void changeAutRollback(boolean isAutoRollback) {
        this.isAutoRollback = isAutoRollback;
    }
}