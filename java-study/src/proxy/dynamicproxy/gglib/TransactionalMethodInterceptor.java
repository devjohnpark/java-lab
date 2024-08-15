package proxy.dynamicproxy.gglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import proxy.generalization.Transactional;

import java.lang.reflect.Method;
import java.sql.SQLException;

public class TransactionalMethodInterceptor implements MethodInterceptor {

//    private final TransactionManagement transactionManager;
//    private final EntityManager entityManager;

//    public TransactionalMethodInterceptor(EntityManager) throws SQLException {
////        this.transactionManager = transactionManager;
////        this.entityManager = transactionManager.createEntityManager();
//    }

    private final Object target;
    private final EntityManager entityManager;

    public TransactionalMethodInterceptor(Object target, EntityManager entityManager) {
        this.target = target;
        this.entityManager = entityManager;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Method targetMethod = target.getClass().getMethod(method.getName(), method.getParameterTypes());
        System.out.println("Not Transactional");
        if (targetMethod.isAnnotationPresent(Transactional.class)) {
            System.out.println("Transactional");
            EntityTransaction transaction = entityManager.getTransaction();
            try {
                transaction.begin();
                Object result = method.invoke(target, objects);
                transaction.commit();
                return result;
            } catch (Exception e) {
                transaction.rollback();
                throw e;
            } finally {
                entityManager.close();
            }
        } else {
            return method.invoke(target, objects);
        }
    }

//    @Override
//    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
//
////        Method targetMethod = target.getClass().getMethod(method.getName(), method.getParameterTypes());
//

//    }
}

