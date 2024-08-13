package proxy.dynamicproxy;

public class EntityManagerClient {
    public static void main(String[] args) {

        EntityManager entityManager = EntityManagerProxyFactory.createProxy();

        JpaMemberRepository jpaMemberRepository = new JpaMemberRepository(entityManager);

        MemberService memberService = new MemberService(jpaMemberRepository);
        Member member = new Member();
        memberService.join(member);
        System.out.println();

        entityManager.clear(); // RealEntityManager 객체 null값 설정
        System.out.println();

        memberService.join(member);
        System.out.println();

        System.out.println(entityManager.getClass().getSuperclass().getSimpleName());
        System.out.println(entityManager.getClass().getSimpleName());

//        jpaMemberRepository.save(member); // 프록시 객체를 통해 RealEntityManager의 persist 메서드가 호출됨
//        System.out.println();
//
//        entityManager.clear(); // RealEntityManager 객체 null값 설정
////        ((EntityManagerProxyHandler) Proxy.getInvocationHandler(entityManager)).releaseEntityManager();
//        System.out.println();
//
//        jpaMemberRepository.save(member); // 프록시 객체를 통해 RealEntityManager 객체 재생성
//        System.out.println();
//

//
//
//        /*
//        proxy entitymanager 구현 혹은 상속
//        persist 오버라이드 -> invocationhandler invoke 호출 후, persist() 메서드 호출 / 부모 메서드 호출 super.persist()
//         */
//
//        EntityManager entityManager1 = EntityManagerProxyHandler.createProxy();
//        EntityManager entityManager2 = EntityManagerProxyHandler.createProxy();
//
//        // 프록시 객체를 통해 실제 객체에 접근
//        entityManager1.persist(member);
//        entityManager2.persist(member);
//
//        System.out.println(entityManager1.getClass().getSimpleName());
//        System.out.println(entityManager2.getClass().getSimpleName());
//
//        System.out.println(entityManager1);
//        System.out.println(entityManager2);
    }
}

