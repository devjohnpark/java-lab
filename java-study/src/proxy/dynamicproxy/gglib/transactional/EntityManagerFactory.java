package proxy.dynamicproxy.gglib.transactional;

// 싱글톤
public class EntityManagerFactory {

    private static EntityManagerFactory instance;
    private final ConnectionProvider connectionProvider = new ConnectionProvider("jdbc:h2:tcp://localhost/~/test", "sa", null);

    private EntityManagerFactory() { }

    public static synchronized EntityManagerFactory getInstance() {
        if (instance == null) {
            instance = new EntityManagerFactory();
        }
        return instance;
    }

    public EntityManager createEntityManager() {
        return new EntityManagerImpl(connectionProvider);
    }

}
