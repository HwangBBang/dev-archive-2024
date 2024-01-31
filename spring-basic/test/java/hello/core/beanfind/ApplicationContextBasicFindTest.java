package hello.core.beanfind;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


class ApplicationContextBasicFindTest {
    AnnotationConfigApplicationContext ac =
            new AnnotationConfigApplicationContext(AppConfig.class);

    @Test
    @DisplayName("특정 Bean 이름으로 조회 하기")
    void findBeanByName() {
        MemberService memberService =
                ac.getBean("memberService", MemberService.class);
//        System.out.println("memberService = " + memberService);
//        System.out.println("memberService.getClass() = " + memberService.getClass());
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @Test
    @DisplayName("특정 Bean 타입으로 조회 하기")
    void findBeanByType() {
        MemberService memberService =
                ac.getBean(MemberService.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @Test
    @DisplayName("특정 Bean 이름과 구체타입으로 조회 하기")
        // 구체 타입으로 권장 X, 유연성 떨어짐
    void findBeanByName2() {
        MemberService memberService =
                ac.getBean("memberService", MemberServiceImpl.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @Test
    @DisplayName("특정 Bean 구체타입으로 조회 하기")
        // 구체 타입으로 권장 X, 유연성 떨어짐
    void findBeanByType2() {
        MemberService memberService =
                ac.getBean(MemberServiceImpl.class);
        assertThat(memberService).isInstanceOf(MemberServiceImpl.class);
    }

    @Test
    @DisplayName("특정 Bean 이름으로 조회 실패")
    void findBeanByNameFail() {
//        ac.getBean("12345", MemberService.class);
        assertThrows(NoSuchBeanDefinitionException.class,
                () -> ac.getBean("12345", MemberService.class));
        /*
        org.junit.jupiter.api.Assertions 의 assertThrows

        ac.getBean("12345", MemberService.class) 이걸 실행 했을 때
        NoSuchBeanDefinitionException 이 예외가 터진다면 테스트 성공
        */
    }
}
