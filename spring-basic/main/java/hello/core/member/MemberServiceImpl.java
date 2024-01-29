package hello.core.member;

import hello.core.repository.MemberRepository;
import hello.core.repository.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository ;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // 인터페이스만 적으면 널포인트익셉션 발생
    // 그래서 구현 객체 선택해줘야함

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
