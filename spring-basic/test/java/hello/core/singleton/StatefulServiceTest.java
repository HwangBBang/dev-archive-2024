package hello.core.singleton;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.assertj.core.api.Assertions.*;


class StatefulServiceTest {

    @Test
    void statefulServiceSingleton() {
        ApplicationContext ac =
                new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        //Thread 1 : A 사용자가 1만원 주문
        statefulService1.order("userA", 10000);
        //Thread 2 : B 사용자가 2만원 주문
        statefulService2.order("userB", 20000);

        //Thread 1 : A 사용자가 주문 금액을 조회
        int price = statefulService1.getPrice();
        System.out.println("price = " + price);

//        price = statefulService2.getPrice();
//        System.out.println("price = " + price);
        assertThat(statefulService1.getPrice()).isEqualTo(20000);

    }

    static class TestConfig {
        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }
    }

}