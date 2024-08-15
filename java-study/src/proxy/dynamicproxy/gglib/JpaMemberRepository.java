package proxy.dynamicproxy.gglib;

import proxy.dynamicproxy.gglib.EntityManager;

public class JpaMemberRepository implements MemberRepository {

    private EntityManager entityManager;

    public JpaMemberRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Member save(Member member) {
        entityManager.persist(member);
        return member;
    }

    @Override
    public Member findByName(String name) {
        return entityManager.createQuery("select m from Member m where m.name = :name", Member.class);
    }
}

