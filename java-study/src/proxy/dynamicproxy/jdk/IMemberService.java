package proxy.dynamicproxy.jdk;

public interface IMemberService {
//    @Transactional
    public Long join(Member member);

    public void validateDuplicatedMember(Member member);
}
