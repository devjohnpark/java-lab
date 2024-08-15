package proxy.dynamicproxy.gglib;

public interface EntityTransaction {
    void begin();

    void commit();

    void rollback();

    boolean isActive();
}
