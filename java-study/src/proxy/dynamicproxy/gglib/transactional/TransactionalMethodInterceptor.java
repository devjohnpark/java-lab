package proxy.dynamicproxy.gglib.transactional;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
//import proxy.dynamicproxy.gglib.transactional.Transactional;

import java.lang.reflect.Method;

public class TransactionalMethodInterceptor implements MethodInterceptor {

    private final Object target;
    private final JpaTransactionManager transactionManager;

    public TransactionalMethodInterceptor(JpaTransactionManager transactionManager, Object target) {
        this.target = target;
        this.transactionManager = transactionManager;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        if (method.isAnnotationPresent(Transactional.class)) {
            try {
                System.out.println("==========TransactionalMethodInterceptor: 실제 객체의 메서드 호출 전 작업 수행==========");
                transactionManager.beginTransaction();
                System.out.println("==========TransactionalMethodInterceptor: 실제 객체의 메서드 호출 작업 수행==========");
                result = method.invoke(target, objects);  // 메서드 호출
                System.out.println("==========TransactionalMethodInterceptor: 실제 객체의 메서드 호출 후 작업 수행==========");
                transactionManager.commitTransaction();
                return result;
            } catch (Exception e) {
                transactionManager.rollbackTransaction();
                throw e;
            } finally {
                transactionManager.closeEntityManager();
            }
        } else {
            result = method.invoke(target, objects);
        }
        return result;
    }
}

