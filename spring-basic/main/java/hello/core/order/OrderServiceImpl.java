package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.repository.MemberRepository;
import hello.core.repository.MemoryMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@RequiredArgsConstructor 생성자 메서드 생성 라이브러리 에노테이션 (롬복)
public class OrderServiceImpl implements OrderService {

    //    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    //    private final DiscountPolicy discountPolicy = new RateDiscountPolicy();
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

//    @RequiredArgsConstructor 로 인해서 아래 코드 주석
//    @Autowired
//    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
//        this.memberRepository = memberRepository;
//        this.discountPolicy = discountPolicy;
//    }

//  빈 조회 동타입 2개 이상 일 때 컴파일 에러
//    @Autowired
//    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
//        this.memberRepository = memberRepository;
//        this.discountPolicy = discountPolicy;
//    }

//  빈 조회 동타입 2개 이상 일 때 발생하는 문제를 파라미터 명 변경으로 해결 ( autowired 기능임 )
//    @Autowired
//    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy rateDiscountPolicy) {
//        this.memberRepository = memberRepository;
//        this.discountPolicy = rateDiscountPolicy;
//    }
//

//  빈 조회 동타입 2개 이상 일 때 발생하는 문제를 @Qualifier 로 해결 ( 구분자를 추가하는 방법임 )
//    @Autowired
//    public OrderServiceImpl(MemberRepository memberRepository,@Qualifier("mainDiscountPolicy") DiscountPolicy discountPolicy) {
//        this.memberRepository = memberRepository;
//        this.discountPolicy = discountPolicy;
//    }

//  빈 조회 동타입 2개 이상 일 때 발생하는 문제를 @Primary 로 해결
// ( 같은 타입으로 등록된 빈 중 하나에 우선순위를 부여하는 방법 개 편함)
    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override

    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member findMember = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(findMember, itemPrice);

        return new Order(memberId,itemName,itemPrice,discountPrice);
    }

    // test 용
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
