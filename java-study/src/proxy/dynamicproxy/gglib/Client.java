package proxy.dynamicproxy.gglib;

import net.sf.cglib.proxy.Enhancer;

public class Client {
    public static void main(String[] args) {

        EntityManagerFactory emf = EntityManagerFactory.getInstance("jdbc:h2:tcp://localhost/~/test", "sa", null);
        EntityManager entityManager = emf.createEntityManager();

        JpaMemberRepository jpaMemberRepository = new JpaMemberRepository(entityManager);

        MemberService memberService = new MemberService(jpaMemberRepository);

        MemberService proxyMemberService = ProxyFactory.createProxy(
                MemberService.class, // 메서드를 호출할 클래스 (상속할 클래스)
                new TransactionalMethodInterceptor(memberService, entityManager), // Interceptor
                new Class<?>[]{MemberRepository.class},  // 생성자의 매개변수의 타입 배열
                new Object[]{jpaMemberRepository}        // 생성자에 전달할 실제 인자 배열
        );

        // 비즈니스 로직 실행
        Member member = new Member();
        member.setId(10L);
        member.setName("john park");
        proxyMemberService.join(member);
        proxyMemberService.validateDuplicatedMember(member);

    }
}
