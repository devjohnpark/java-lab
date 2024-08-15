package proxy.dynamicproxy.gglib;


public interface MemberRepository {
    Member save(Member member);
    Member findByName(String name);
}