package hello.core.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.assertj.core.api.Assertions.assertThat;


class StatelessServiceTest {

    @Test
    void statelessServiceSingleton() {
        ApplicationContext ac =
                new AnnotationConfigApplicationContext(TestConfig.class);
        StatelessService statelessService1 = ac.getBean(StatelessService.class);
        StatelessService statelessService2 = ac.getBean(StatelessService.class);


        //Thread 1 : A 사용자가 1만원 주문
        int userAPrice = statelessService1.order("userA", 10000);
        //Thread 2 : B 사용자가 2만원 주문
        int userBPrice = statelessService2.order("userB", 20000);


        //Thread 1 : A 사용자가 주문 금액을 조회
        System.out.println("userAPrice = " + userAPrice);

//        price = statefulService2.getPrice();
//        System.out.println("price = " + price);
        assertThat(userAPrice).isEqualTo(10000);
        assertThat(userBPrice).isEqualTo(20000);

    }

    static class TestConfig {
        @Bean
        public StatelessService statelessService() {
            return new StatelessService();
        }
    }

}