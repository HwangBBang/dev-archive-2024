package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

//        System.out.println("name = " + name);
//
//        log.trace("info = {}", name );
//        log.debug("info = {}", name ); // 디버그 할 때 (개발 서버)
//        log.info("info = {}", name ); // 중요한 정보야 (운영 서버)
//        log.warn("info = {}", name ); // 경고 , 위험해
//        log.error("info = {}", name ); // 에러
        return "logTest OK";
    }


}


