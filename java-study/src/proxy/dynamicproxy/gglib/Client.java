package proxy.dynamicproxy.gglib;

import net.sf.cglib.proxy.Enhancer;

public class Client {
    public static void main(String[] args) {

        EntityManagerFactory emf = EntityManagerFactory.getInstance("jdbc:h2:tcp://localhost/~/test", "sa", null);
        EntityManager entityManager = emf.createEntityManager();



//            EntityManager entityManager = transactionManager.createEntityManager();
            // Repository 생성
            JpaMemberRepository jpaMemberRepository = new JpaMemberRepository(entityManager);

            MemberService memberService = new MemberService(jpaMemberRepository);

//            Enhancer enhancer = new Enhancer();
//            enhancer.setSuperclass(MemberService.class); // CGLIB는 구체 클래스를 상속 받아서 프록시를 생성하기 때문에 상혹할 구체 클래스를 지정
//            enhancer.setCallback(new TransactionalMethodInterceptor(memberService)); // 프록시 핸들러 할당

            // 2. 프록시 생성
//            MemberService proxyMemberService = (MemberService) enhancer.create(); // setSuperclass() 에서 지정한 클래스를 상속 받아서 프록시가 만들어진다.
            // 프록시 생성: MemberService의 생성자에 필요한 인자 전달
            MemberService proxyMemberService = ProxyFactory.createProxy(
                    MemberService.class,
                    new TransactionalMethodInterceptor(memberService, entityManager),
                    new Class<?>[]{MemberRepository.class},  // 생성자의 매개변수의 타입 배열
                    new Object[]{jpaMemberRepository}        // 생성자에 전달할 실제 인자 배열
            );

        // MyService 프록시 생성
//            MemberService proxyMemberService = ProxyFactory.createProxy(MemberService.class, new TransactionalMethodInterceptor(memberService));

//            Enhancer enhancer = new Enhancer();
//            enhancer.setSuperclass(MemberService.class);
//            enhancer.setCallback(new TransactionalMethodInterceptor(transactionManager));
//            MemberService myServiceProxy = (MemberService) enhancer.create(new Class[]{MyRepository.class}, new Object[]{myRepository});

            // 비즈니스 로직 실행
            Member member = new Member();
            member.setId(10L);
            member.setName("john p");
            proxyMemberService.join(member);


    }
}
