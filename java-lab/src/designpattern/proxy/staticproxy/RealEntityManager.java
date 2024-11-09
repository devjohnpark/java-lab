package designpattern.proxy.staticproxy;


public class RealEntityManager implements EntityManager {

    @Override
    public void persist(Object entity) {
        System.out.println("persist 메서드의 실제 로직 수행");
        // SQL 문 변환 후 저장 로직
    }
}

