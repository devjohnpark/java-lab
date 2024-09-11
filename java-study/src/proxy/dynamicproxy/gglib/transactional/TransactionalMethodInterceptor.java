package proxy.dynamicproxy.gglib.transactional;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TransactionalMethodInterceptor implements MethodInterceptor {

    private final Object target;
    private final JpaEntityTransactionManager transactionManager;

    public TransactionalMethodInterceptor(JpaEntityTransactionManager transactionManager, Object target) {
        this.target = target;
        this.transactionManager = transactionManager;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        if (method.isAnnotationPresent(Transactional.class) || target.getClass().isAnnotationPresent(Transactional.class)) {
            preAction();
            result = interAction(method, objects);
            postAction();
        } else {
            result = method.invoke(target, objects);
        }
        return result;
    }


    private void preAction() throws Throwable {
        System.out.println("==========TransactionalMethodInterceptor: 실제 객체의 메서드 호출 전 작업 수행==========");
        transactionManager.beginTransaction();
    }

    public void postAction() {
        System.out.println("==========TransactionalMethodInterceptor: 실제 객체의 메서드 호출 후 작업 수행==========");
        transactionManager.commitTransaction();
    }

    public Object interAction(Method method, Object[] args) {
        System.out.println("==========TransactionalMethodInterceptor: 실제 객체의 메서드 호출 작업 수행==========");
        Object result = null;
        try {
            result = method.invoke(target, args);  // 실제 객체의 메서드 호출
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

}

