package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용 되어야 한다. ")
    void vip_ok() {
        //given
        Member memberVIP = new Member(1L, "memberVIP", Grade.VIP);
        //when
        int discountAmount = discountPolicy.discount(memberVIP, 10000);

        //then
        assertThat(discountAmount).isEqualTo(1000);
    }
    @Test
    @DisplayName("VIP가 아니면 10% 할인이 적용 되지 않아야 한다. ")
    void vip_not_ok() {
        //given
        Member member = new Member(1L, "member", Grade.BASIC);
        //when
        int discountAmount = discountPolicy.discount(member, 10000);

        //then
        assertThat(discountAmount).isEqualTo(0);
    }
}