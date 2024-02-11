package hello.core.repository;

import hello.core.member.Member;

public interface MemberRepository {
    void save(Member member) ;
    // 회원 ID로 찾기
    Member findById(Long memberId);
}
