package proxy.dynamicproxy.gglib.transactional;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

// @Transactional 애노테이션을 위한 프록시 객체
public class CglibDynamicProxyFactory {

    public static <T> T createProxy(Class<T> targetClass, MethodInterceptor interceptor, Class<?>[] argumentTypes, Object[] arguments) {
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(targetClass);  // 런타임에 타겟 클래스를 상속하여 하위 클래스의 바이트코드를 직접 생성해서 다이나믹 프록시 클래스 구현
        enhancer.setCallback(interceptor);    // 프록시 객체의 오버라이드된 메서드에서 인터셉터에 전달되어 부가기능 수행과 함께 실제 객체의 메서드 호출 (쉽게 말해 인터셉트가 실제 객체 호출 가로챔)

        // Create the proxy instance using the constructor with arguments
        return targetClass.cast(enhancer.create(argumentTypes, arguments)); // 바이트 코드 직접 생성하여 프록시 객체 생성후 타입 캐스팅
    }
}
