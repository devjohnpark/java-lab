//package proxy.dynamicproxy.gglib;
//
//
//public class TransactionManagement {
//
////    private final EntityManagerFactory entityManagerFactory;
//    private EntityManager entityManager;
//    private EntityTransaction transaction;
//
//    public TransactionManagement(ProxyFactory entityManagerFactory) {
//        this.entityManagerFactory = entityManagerFactory;
//    }
//
//    public void beginTransaction() {
//        entityManager = EntityManagerFactory.createEntityManager();
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//    }
//
//    public void commitTransaction() {
//        EntityTransaction transaction = entityManager.getTransaction();
//        if (transaction.isActive()) {
//            transaction.commit();
//        }
//    }
//
//    public void rollbackTransaction() {
//        EntityTransaction transaction = entityManager.getTransaction();
//        if (transaction.isActive()) {
//            transaction.rollback();
//        }
//    }
//
//    public EntityManager getEntityManager() {
//        return entityManager;
//    }
//
//    public void closeEntityManager() {
//        if (entityManager != null && entityManager.isOpen()) {
//            entityManager.close();
//            System.out.println("EntityManager has been closed.");
//        }
//    }
//}