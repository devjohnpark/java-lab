package proxy.dynamicproxy.gglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import proxy.dynamicproxy.jdk.MemberService;

// 애노테이션을 위한 프록시 객체
public class ProxyFactory {

//    // Generic method to create a proxy with a specific MethodInterceptor
//    public static <T> T createProxy(Class<T> targetClass, MethodInterceptor interceptor) {
//        Enhancer enhancer = new Enhancer();
//
//        enhancer.setSuperclass(targetClass);
//        enhancer.setCallback(interceptor); // Set the provided interceptor
//
//        // Create the proxy instance and cast it to the correct type
//        MemberService proxy = (MemberService) enhancer.create();
//        return targetClass.cast(proxy);  // Use targetClass.cast to ensure correct casting
//    }

    // Generic method to create a proxy with a specific MethodInterceptor
    public static <T> T createProxy(Class<T> targetClass, MethodInterceptor interceptor, Class<?>[] argumentTypes, Object[] arguments) {
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(targetClass);  // Set the target class as the superclass
        enhancer.setCallback(interceptor);    // Set the provided interceptor

        // Create the proxy instance using the constructor with arguments
        return targetClass.cast(enhancer.create(argumentTypes, arguments));
    }
}
