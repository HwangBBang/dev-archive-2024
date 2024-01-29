package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import hello.core.repository.MemberRepository;
import hello.core.repository.MemoryMemberRepository;

public class AppConfig {

    // 생성자 주입 ! -> 이걸 통해서 DIP 를 지킬 수 있음 구현객체를 이놈이 생성하는거지
    public MemberService memberService(){
       return new MemberServiceImpl(memberRepository());
    }
    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    private DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

}
