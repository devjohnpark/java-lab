package proxy.dynamicproxy.jdk;

public interface MemberRepository {
    Member save(Member member);
    Member findByName(String name);
}