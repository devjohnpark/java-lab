package designpattern.proxy.dynamicproxy.jdk.lazyinit;

import designpattern.proxy.dynamicproxy.jdk.EntityManager;
import designpattern.proxy.dynamicproxy.jdk.JpaMemberRepository;
import designpattern.proxy.dynamicproxy.jdk.Member;
import designpattern.proxy.dynamicproxy.jdk.RealEntityManager;

public class Client {
    public static void main(String[] args) {
        EntityManager entityManager = ProxyFactory.createProxy(EntityManager.class, new LazyInitializationHandler(RealEntityManager.class));
        EntityManager entityManager2 = ProxyFactory.createProxy(EntityManager.class, new LazyInitializationHandler(RealEntityManager.class));

        JpaMemberRepository jpaMemberRepository = new JpaMemberRepository(entityManager);
        Member member1 = new Member();

        jpaMemberRepository.save(member1); // 프록시 객체를 통해 RealEntityManager의 persist 메서드가 호출됨
        System.out.println();

        entityManager.clear(); // RealEntityManager 객체 null값 설정
        System.out.println();

        Member member2 = new Member();
        jpaMemberRepository.save(member2); // 프록시 객체를 통해 RealEntityManager 객체 재생성
        System.out.println();


//        jpaMemberRepository.findByName("john park");
//        System.out.println();

        System.out.println("Super Class " + entityManager.getClass().getSuperclass().getSimpleName());
        System.out.println("Class " + entityManager.getClass().getSimpleName());

//        EntityManager entityManager = CglibDynamicProxyFactory.createProxy(EntityManager.class, new LazyInitializationHandler(RealEntityManager.class));
//
//        JpaMemberRepository jpaMemberRepository = new JpaMemberRepository(entityManager);
//        Member member = new Member();
//        MemberService memberService = new MemberService(jpaMemberRepository);
//        IMemberService proxyMemberService = CglibDynamicProxyFactory.createProxy(IMemberService.class, new TransactionalDynamicProxyHandler(memberService));
//        proxyMemberService.join(member);

    }
}
