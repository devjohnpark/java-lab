package proxy.generalization;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxyFactory {
//    public static <T> T createProxy(Class<T> interfaceType, Class<? extends T> realObjectType)  {
//        T proxyInstance = Proxy.newProxyInstance(
//                interfaceType.getClassLoader(),
//                new Class<?>[]{interfaceType},
//                new DynamicProxyHandler()
//        );
//
//        // 타입을 체크하여 안전하게 캐스팅
//        if (interfaceType.isInstance(proxyInstance)) {
//            return interfaceType.cast(proxyInstance);
//        } else {
//            throw new IllegalArgumentException("Created proxy is not of the expected type: " + interfaceType.getName());
//        }
//    }


    // 제네릭을 사용하여 다양한 인터페이스 타입에 대한 프록시를 생성 가능
    public static <T> T createProxy(Class<T> interfaceType, InvocationHandler handler) {
        // 프록시 객체 생성

        // Proxy.newProxyInstance()는 지정된 인터페이스를 구현하는 프록시 객체를 생성한다. (인터페이스를 기반으로 프록시 객체가 생성되므로, 인터페이스에 종속적이다.)
        Object proxyInstance = Proxy.newProxyInstance(
                interfaceType.getClassLoader(),
                new Class<?>[]{interfaceType},
                handler
        );

        // 제네릭 타입으로 캐스팅 후 반환
        return interfaceType.cast(proxyInstance);
    }

//    public static <T> T createProxy1(Class<T> classType, InvocationHandler handler) {
//        // 프록시 객체 생성
//        classType.getInterfaces()
//        Class<?> clazz = classType.class;
//
//        // 클래스가 구현한 인터페이스 목록 가져오기
//        Class<?>[] interfaces = classType.getInterfaces();
//
//        Object proxyInstance = Proxy.newProxyInstance(
//                interfaces.getClassLoader(),
//                interfaces,
//                handler
//        );
//
//        // 제네릭 타입으로 캐스팅 후 반환
//        return interfaceType.cast(proxyInstance);
//    }
}
