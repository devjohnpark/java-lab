package proxy.dynamicproxy;

import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Member findByName(String name);
}