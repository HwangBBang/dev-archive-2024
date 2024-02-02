package hello.core.order;

import hello.core.AppConfig;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    @BeforeEach //각 테스트가 실행하기전에 작동하는 녀석 ! @Test 가 2개 있으면 2번 돎
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }


    @Test
    void createOrder(){
    //given
        Long memberId = 1L;
        Member testMember = new Member(memberId, "testMember", Grade.VIP);

    //when
        memberService.join(testMember);
        Order testOrder = orderService.createOrder(memberId, "testItem", 2000);

    //then
        Assertions.assertThat(testOrder.getDiscountPrice()).isEqualTo(200);
    }

}
