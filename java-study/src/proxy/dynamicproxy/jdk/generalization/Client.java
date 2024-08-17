package proxy.dynamicproxy.jdk.generalization;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// Subject: 프록시와 실제 객체가 구현해야 하는 공통 인터페이스
interface Subject {
    void request();
}

// RealSubject: 프록시가 대리하는 실제 객체
class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject: Handling request.");
    }
}

// 프록시 객체가 대리하는 실제 객체의 메서드 호출을 핸들링하는 객체
class InitializationHandlerImpl implements InvocationHandler {

    private Object realObject;

    public InitializationHandlerImpl(Object realObject) {
        this.realObject = realObject;
    }

    public void preAction() throws Throwable {
        System.out.println("[실제 객체의 메서드 호출 전 작업 수행]");
    }

    public void postAction() {
        System.out.println("[실제 객체의 메서드 호출 후 작업 수행]");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preAction();
        System.out.println("[실제 객체의 메서드 호출]");
        Object result = method.invoke(realObject, args);
        postAction();
        return result;
    }
}

// 프록시 객체를 생성하는 클래스
class ProxyFactory {
    public static <T> T createProxy(Class<T> interfaceType, InvocationHandler handler) {
        Object proxyInstance = Proxy.newProxyInstance(
                proxy.dynamicproxy.jdk.lazyinit.ProxyFactory.class.getClassLoader(), // 프록시 클래스의 로딩에 사용할 클래스로더
                new Class<?>[]{interfaceType}, // 프록시가 구현해야 하는 인터페이스 배열
                handler // 프록시가 대리하는 실제 객체의 메서드 호출을 처리할 InvocationHandler
        );
        return interfaceType.cast(proxyInstance);
    }
}

// 서비스(메서드)를 제공받는 클라이언트
public class Client {
    public static void main(String[] args) {
        Subject subject = ProxyFactory.createProxy(Subject.class, new InitializationHandlerImpl(new RealSubject()));
        subject.request();
    }
}
