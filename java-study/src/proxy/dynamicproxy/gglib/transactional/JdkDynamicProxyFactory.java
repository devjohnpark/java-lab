package proxy.dynamicproxy.gglib.transactional;

import proxy.dynamicproxy.jdk.lazyinit.ProxyFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;


public class JdkDynamicProxyFactory {
    // 제네릭을 사용하여 다양한 인터페이스 타입에 대한 프록시를 생성 가능
    public static <T> T createProxy(Class<T> primaryInterface, InvocationHandler handler, Class<?>... additionalInterfaces) {
        // 모든 인터페이스를 합치기 위한 배열 생성
        Class<?>[] allInterfaces = new Class<?>[additionalInterfaces.length + 1];
        allInterfaces[0] = primaryInterface;
        System.arraycopy(additionalInterfaces, 0, allInterfaces, 1, additionalInterfaces.length);

        // Proxy.newProxyInstance()는 지정된 인터페이스를 구현하는 프록시 객체를 생성한다. (인터페이스를 기반으로 프록시 객체가 생성되므로, 인터페이스에 종속적이다.)
        Object proxyInstance = Proxy.newProxyInstance(
                primaryInterface.getClassLoader(), // 프록시가 구현할 주요 인터페이스의 클래스 로더를 사용
                allInterfaces, // 프록시가 구현해야 하는 인터페이스 배열
                handler // 프록시가 대리하는 실제 객체의 메서드 호출을 처리할 InvocationHandler
        );

        // 제네릭 타입으로 캐스팅 후 반환
        return primaryInterface.cast(proxyInstance);
    }
}