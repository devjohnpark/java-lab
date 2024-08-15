package proxy.dynamicproxy.jdk;

public interface EntityManager {
    void persist(Object entity);
    <T> T createQuery(String sql, Class<T> entityType);
    void clear();
}

