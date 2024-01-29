package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService;


    @BeforeEach //각 테스트가 실행하기전에 작동하는 녀석 ! @Test 가 2개 있으면 2번 돎
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService= appConfig.memberService();
    }
    @Test
    void join() {
        // given : 아래 같은 맴버를 만들었을 때
        Member member = new Member(1L, "testMember1", Grade.VIP);

        // when : 만든 member를 등록했을 때
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        // then : 검증
        Assertions.assertThat(member).isEqualTo(findMember);
        // member 와 findMember 가 똑같니 ?



    }
}
