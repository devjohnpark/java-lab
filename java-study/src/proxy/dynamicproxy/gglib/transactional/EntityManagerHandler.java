package proxy.dynamicproxy.gglib.transactional;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EntityManagerHandler implements InvocationHandler {

    private EntityManager entityManager;
    private final EntityManagerFactory entityManagerFactory;

    public EntityManagerHandler(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    public void preAction() throws Throwable {
        System.out.println("----------EntityManagerHandler: 실제 객체의 메서드 호출 전 작업 수행----------");
        if (entityManager == null) {
            System.out.println("--------->새로운 EntityManger 구현체 생성");
            entityManager = entityManagerFactory.createEntityManager();
        } else {
            System.out.println("--------->기존 EntityManger 구현체 사용");
        }
    }

    public void postAction() {
        System.out.println("----------EntityManagerHandler: 실제 객체의 메서드 호출 후 작업 수행----------");
        System.out.println("--------->없음");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preAction();
        System.out.println("----------EntityManagerHandler: 실제 객체의 메서드 호출----------");
        Object result = method.invoke(entityManager, args); // 메서드 실행 결과를 result 변수에 저장
        if (method.getName().equals("close")) {
            entityManager = null;
        }
        postAction();
        return result; // 메서드 실행 결과 반환
    }
}