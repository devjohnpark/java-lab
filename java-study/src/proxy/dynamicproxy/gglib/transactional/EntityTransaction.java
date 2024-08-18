package proxy.dynamicproxy.gglib.transactional;

public interface EntityTransaction {
    void begin();

    void commit();

    void rollback();

    boolean isActive();
}
