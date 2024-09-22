package designpattern.proxy.dynamicproxy.gglib.test;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

// 프록시 핸들러
class MyProxyInterceptor implements MethodInterceptor {

    private final Object target;

    MyProxyInterceptor(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(
            Object o,
            Method method,
            Object[] args,
            MethodProxy methodProxy
    ) throws Throwable {

        System.out.println("TimeProxy 실행");
        long startTime = System.nanoTime();

        Object result = method.invoke(target, args); // 파라미터로 전달받은 메서드를 invoke로 실행

        long endTime = System.nanoTime();
        long resultTime = endTime - startTime;
        System.out.println("TimeProxy 종료 resultTime = " + resultTime);

        return result;
    }
}

// 프록시를 적용할 대상 타켓
class Subject {
    public void call() {
        System.out.println("서비스 호출");
    }
}

public class Test {
    public static void main(String[] arguments) {

        // 1. 프록시 등록 (CGLIB는 Enhancer를 사용해서 프록시를 등록한다)
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Subject.class);
        enhancer.setCallback(new MyProxyInterceptor(new Subject()));

        // 2. 프록시 생성
        Subject proxy = (Subject) enhancer.create(); // setSuperclass() 에서 지정한 클래스를 상속 받아서 프록시가 만들어진다.

        // 3. 프록시 호출
        proxy.call();
    }
}
