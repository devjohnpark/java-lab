package proxy.generalization;

import proxy.dynamicproxy.jdk.EntityManager;
import proxy.dynamicproxy.jdk.JpaMemberRepository;
import proxy.dynamicproxy.jdk.Member;
import proxy.dynamicproxy.jdk.RealEntityManager;

public class Client {
    public static void main(String[] args) {
        EntityManager entityManager = DynamicProxyFactory.createProxy(EntityManager.class, new DynamicProxyHandler(RealEntityManager.class));

        JpaMemberRepository jpaMemberRepository = new JpaMemberRepository(entityManager);
        Member member = new Member();

        jpaMemberRepository.save(member); // 프록시 객체를 통해 RealEntityManager의 persist 메서드가 호출됨
        System.out.println();

        entityManager.clear(); // RealEntityManager 객체 null값 설정
//        ((EntityManagerProxyHandler) Proxy.getInvocationHandler(entityManager)).releaseEntityManager();
        System.out.println();

        jpaMemberRepository.save(member); // 프록시 객체를 통해 RealEntityManager 객체 재생성
        System.out.println();

        System.out.println(entityManager.getClass().getSuperclass().getSimpleName());
        System.out.println(entityManager.getClass().getSimpleName());

//        EntityManager entityManager = DynamicProxyFactory.createProxy(EntityManager.class, new DynamicProxyHandler(RealEntityManager.class));
//
//        JpaMemberRepository jpaMemberRepository = new JpaMemberRepository(entityManager);
//        Member member = new Member();
//        MemberService memberService = new MemberService(jpaMemberRepository);
//        IMemberService proxyMemberService = DynamicProxyFactory.createProxy(IMemberService.class, new TransactionalDynamicProxyHandler(memberService));
//        proxyMemberService.join(member);

    }
}
