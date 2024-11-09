package designpattern.proxy.dynamicproxy.jdk;

import java.lang.reflect.Proxy;

public class EntityManagerProxyFactory {
    public static EntityManager createProxy() {
        return (EntityManager) Proxy.newProxyInstance(
                EntityManager.class.getClassLoader(),
                new Class[]{EntityManager.class},
                new EntityManagerProxyHandler()
        );
    }
}
