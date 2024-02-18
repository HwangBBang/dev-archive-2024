package hello.servlet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class MemberRepositoryTest {
    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }


    @Test
    void save() {
        //given
        Member member = new Member("hello", 20);

        //when
        Member savedMember = memberRepository.save(member);

        //then
        Member findedMember = memberRepository.findByID(savedMember.getId());
        assertThat(savedMember).isSameAs(findedMember);
    }

    @Test
    void findAll() {
        //given
        Member member1 = new Member("mem1", 20);
        Member member2 = new Member("mem2", 21);
        Member member3 = new Member("mem3", 22);

        memberRepository.save(member1);
        memberRepository.save(member2);
        memberRepository.save(member3);

        //when
        List<Member> result = memberRepository.findAll();

        //then
        assertThat(result.size()).isEqualTo(3);
        assertThat(result).contains(member1, member2, member3);
        // contains 는 member1, member2, member3 가 result 에 들어있는지 확인하는 것



    }
}
