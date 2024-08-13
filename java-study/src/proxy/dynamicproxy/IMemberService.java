package proxy.dynamicproxy;

import proxy.generalization.Transactional;

public interface IMemberService {
//    @Transactional
    public Long join(Member member);

    public void validateDuplicatedMember(Member member);
}
