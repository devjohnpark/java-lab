package designpattern.proxy.dynamicproxy.gglib.transactional;

public interface EntityManager {
    void persist(Object entity);
    <T> T createQuery(String sql, Class<T> entityType);
    void close();
    void clear();
    EntityTransaction getTransaction();
}