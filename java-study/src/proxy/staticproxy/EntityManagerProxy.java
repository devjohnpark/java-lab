package proxy.staticproxy;

public class EntityManagerProxy implements EntityManager {
    private EntityManager realEntityManager;

    @Override
    public void persist(Object entity) {
        System.out.println("[실제 구현체의 메서드 호출 전 작업 수행]");
        if (realEntityManager == null) {
            realEntityManager = new RealEntityManager();
            System.out.println("새로운 EntityManger 구현체 생성");
        }
        System.out.println("[실제 구현체의 메서드 호춣]");
        realEntityManager.persist(entity);
        System.out.println("[실제 구현체의 메서드 호출 후 작업 수행]");
    }

    // RealEntityManager 객체 null값 설정을 위한 메서드
    public void releaseEntityManager() {
        realEntityManager = null;
        System.out.println("EntityManager 구현체 null 설정 완료");
    }
}