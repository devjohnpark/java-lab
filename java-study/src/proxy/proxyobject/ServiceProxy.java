package proxy.proxyobject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ServiceProxy implements InvocationHandler {
    private Service realService;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (realService == null) {
            // 실제 객체를 필요할 때까지 생성하지 않음
            realService = new RealService();
        }
        System.out.println("프록시: 메서드 호출 전 작업 수행");
        Object result = method.invoke(realService, args);
        System.out.println("프록시: 메서드 호출 후 작업 수행");
        return result;
    }

    public static Service createProxy() {
        return (Service) Proxy.newProxyInstance(
                Service.class.getClassLoader(),
                new Class[]{Service.class},
                new ServiceProxy()
        );
    }
}