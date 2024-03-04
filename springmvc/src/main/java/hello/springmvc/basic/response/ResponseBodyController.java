package hello.springmvc.basic.response;

import hello.springmvc.basic.HelloData;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


//@RestController
@Slf4j
@Controller
// @ResponseBody 리스폰스바디 에노테이션은 클래스 레벨에 적용해 이하의 메소드들에 일괄적으로 적용 시킬 수 있다 .
// @ResponseBody + @Controller -> @RestController 이다.
public class ResponseBodyController {
    @GetMapping("/response-body-string-v1")
    public void responseBodyV1(HttpServletResponse response)throws IOException {
        response.getWriter().write("OK");
    }
    @GetMapping("/response-body-string-v2")
    public ResponseEntity<String > responseBodyV2()throws IOException {
        return new ResponseEntity<String>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/response-body-string-v3")
    public String responseBodyV3() {
        return "OK";
    }

    // ---위 방식은 String 처리---

    @GetMapping("/response-body-json-v1")
    public ResponseEntity<HelloData> responseJsonV1() { // HelldData 클래스 json
        HelloData helloData = new HelloData();
        helloData.setAge(32);
        helloData.setUsername("hwangbbang");
        return new ResponseEntity<HelloData>(helloData, HttpStatus.CREATED);
    }

    // v1 처럼 사용하면 상태코드를 조작할 수 있다. 하지만, v2 처럼하게 되면 상태코드를 조작할 수 없다.
    // 따라서 @ResponseStatus 하는 에노테이션으로 상태코드를 전달해준다.
    // 조건에 따라 동적으로 처리하려면, v1을 사용하는게 맞다.

    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("/response-body-json-v2")
    public HelloData responseJsonV2() { // HelldData 클래스 json
        HelloData helloData = new HelloData();
        helloData.setAge(32);
        helloData.setUsername("hwangbbang");
        return helloData;
    }

}
