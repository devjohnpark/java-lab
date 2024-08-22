package proxy.dynamicproxy.gglib.transactional;

public class Client {
    public static void main(String[] args) {

        EntityManagerFactory emf = EntityManagerFactory.getInstance();
        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager(emf);
        EntityManager entityManager = jpaTransactionManager.initProxyEntityManager();

        JpaMemberRepository jpaMemberRepository = new JpaMemberRepository(entityManager); // EntityManager 프록시 객체 주입

        MemberService memberService = new MemberService(jpaMemberRepository);

        MemberService proxyMemberService = CglibDynamicProxyFactory.createProxy(
                MemberService.class, // 해당 클래스의 기능을 대신할 프록시 객체 생성 (서브 클래싱할 클래스 타입)
                new TransactionalMethodInterceptor(jpaTransactionManager, memberService), // Interceptor
                new Class<?>[]{MemberRepository.class},  // 서브 클래싱할 객체의 생성자 매개변수의 타입 배열
                new Object[]{jpaMemberRepository}        // 서브 클래싱할 객체의 생성자에 전달할 실제 인자 배열
        );

        System.out.println(proxyMemberService.getClass().getSimpleName());

        // 비즈니스 로직 실행 1
        Member member1 = new Member();
        member1.setId(1L);
        member1.setName("john park");
        proxyMemberService.join(member1);
        System.out.println();

        // 비즈니스 로직 실행 2
        Member member2 = new Member();
        member2.setId(2L);
        member2.setName("john park");
        proxyMemberService.join(member2);

        emf.closeAllEntityManagers();
    }
}
