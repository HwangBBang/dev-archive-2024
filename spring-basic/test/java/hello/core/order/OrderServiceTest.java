package hello.core.order;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.repository.MemberRepository;
import hello.core.repository.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();



    @Test
    void createOrder(){
    //given
        Long memberId = 1L;
        Member testMember = new Member(memberId, "testMember", Grade.VIP);

    //when
        memberService.join(testMember);
        Order testOrder = orderService.createOrder(memberId, "testItem", 2000);

    //then
        Assertions.assertThat(testOrder.getDiscountPrice()).isEqualTo(1000);
    }

}
