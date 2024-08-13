package proxy.generalization;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;

public class TransactionalDynamicProxyHandler implements InvocationHandler {
    private final Object target;

    public TransactionalDynamicProxyHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Method targetMethod = target.getClass().getMethod(method.getName(), method.getParameterTypes());
        if (targetMethod.isAnnotationPresent(Transactional.class)) {
            System.out.println("트랜잭션 시작");
            try {
                // 실제 메서드 호출
                Object result = method.invoke(target, args);

                System.out.println("트랜잭션 커밋");

                return result;
            } catch (Exception e) {
                System.out.println("트랜잭션 롤백");
                throw e;
            }
        } else {
            // 트랜잭션이 필요하지 않은 경우, 그냥 메서드를 호출
            System.out.println("트랜잭션 불필요");
            return method.invoke(target, args);
        }
    }
}
