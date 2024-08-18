package proxy.dynamicproxy.gglib.transactional;


public interface MemberRepository {
    Member save(Member member);
    Member findByName(String name);
}