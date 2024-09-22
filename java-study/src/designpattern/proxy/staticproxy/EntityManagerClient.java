package designpattern.proxy.staticproxy;


public class EntityManagerClient {
    public static void main(String[] args) {
        EntityManager entityManagerProxy = new EntityManagerProxy();

        JpaMemberRepository jpaMemberRepository = new JpaMemberRepository(entityManagerProxy);
        Member member = new Member();

        jpaMemberRepository.save(member); // 프록시 객체를 통해 RealEntityManager의 persist 메서드가 호출됨
        System.out.println();

        jpaMemberRepository.save(member); // 프록시 객체를 통해 RealEntityManager 객체 재생성
    }
}

