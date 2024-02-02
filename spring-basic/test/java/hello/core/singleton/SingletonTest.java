package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;

class SingletonTest {
    @Test
    @DisplayName("바닐라 DI 컨테이너 / 스프링X DI 컨테이너")
    void vanillaContainer() {
        AppConfig appConfig = new AppConfig();
        // 1.조회 : 호출 할 때 마다 객체를 생성하는가?
        MemberService memberService1 = appConfig.memberService();
        MemberService memberService2 = appConfig.memberService();

        //참조값이 다른지 ?
        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);
        assertThat(memberService1).isNotEqualTo(memberService2);
        assertThat(memberService1).isNotSameAs(memberService2);
    }

    @Test
    @DisplayName("스프링 컨테이너 / 싱글톤 패턴")
    void singletonContainer() {
        ApplicationContext ac =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // 1.조회 : 호출 할 때 마다 객체를 생성하는가?
        MemberService memberService1 = ac.getBean("memberService", MemberService.class);
        MemberService memberService2 = ac.getBean("memberService", MemberService.class);

        //참조값이 다른지 ?
        System.out.println("memberService1 = " + memberService1);
        System.out.println("memberService2 = " + memberService2);
        assertThat(memberService1).isEqualTo(memberService2);
        assertThat(memberService1).isSameAs(memberService2);
    }

    @Test
    @DisplayName("싱글톤패턴 적용 한 객체 사용하기")
    void singletonServiceTest() {
        // new SingletonService(); private 생성자이기에 여기서 생성 못함

        SingletonService singletonService1 = SingletonService.getInstance();
        SingletonService singletonService2 = SingletonService.getInstance();

        System.out.println("singletonService1 = " + singletonService1);
        System.out.println("singletonService2 = " + singletonService2);
        assertThat(singletonService1).isEqualTo(singletonService2);
        assertThat(singletonService1).isSameAs(singletonService2);
    }
}
