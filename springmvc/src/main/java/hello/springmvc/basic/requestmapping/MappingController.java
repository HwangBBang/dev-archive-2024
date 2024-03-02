package hello.springmvc.basic.requestmapping;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class MappingController {
    private final Logger log = LoggerFactory.getLogger(getClass());


//    @RequestMapping(value = "/hello-basic",method = RequestMethod.GET)
    @GetMapping("/hello-basic")
    public String helloBasic() {
        log.info("hello basic");
        return "hello-basic OK";
    }

    /**
     * 편리한 축약 애노테이션
     *
     * @GetMapping
     * @PostMapping
     * @PutMapping
     * @DeleteMapping
     * @PatchMapping
     */



    @GetMapping("/mapping/{userId}")
    public String mappingPath(@PathVariable("userId") String data) {
        log.info("mappingPath userId = {}", data);
        return "OK";
    }
    /**
     * PathVariable 사용 다중 */
    @GetMapping("/mapping/users/{userId}/orders/{orderId}")
    public String mappingPath(@PathVariable String userId, @PathVariable Long orderId) {
        log.info("mappingPath userId={}, orderId={}", userId, orderId);
        return "ok";
    }
}
