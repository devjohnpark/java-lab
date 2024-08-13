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
        Object proxyInstance = Proxy.newProxyInstance(
                interfaceType.getClassLoader(),
                new Class<?>[]{interfaceType},
                handler
        );

        // 제네릭 타입으로 캐스팅 후 반환
        return interfaceType.cast(proxyInstance);
    }
}
