package proxy.dynamicproxy;

public class RealEntityManager implements EntityManager {
    @Override
    public void persist(Object entity) {
        System.out.println("persist 메서드의 실제 로직 수행");
        // SQL 문 변환 후 저장 로직
    }

    @Override
    public <T> T createQuery(String jpql, Class<T> entityType) {
        System.out.println("createQuery 메서드의 실제 로직 수행");
        try {
            // 기본 생성자를 통해 새로운 인스턴스를 생성하여 반환
            return entityType.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null; // 예외 발생 시 null 반환 (실제로는 예외 처리를 다르게 할 수 있음)
        }
    }

    @Override
    public void clear() {
        System.out.println("EntityManager 닫기");
        // persistent 상태의 entity를 비우고 모든 entity를 detached 상태로 변경한다.
    }
}

