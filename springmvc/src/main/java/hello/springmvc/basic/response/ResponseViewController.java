package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {
    @RequestMapping("/response-view-v1")
    public ModelAndView responseViewV1() {
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data", "Hello!");
        return mav;
    }
    @RequestMapping("/response-view-v2") // 권장
    public String responseViewV2(Model model) {
        model.addAttribute("data", "Hello!");
        return "response/hello"; // 뷰의 논리적 이름 ..<- (@Controller + String 반환)
    }
    @RequestMapping("/response/hello") // 비추천 방법
    public void responseViewV3(Model model) {
        model.addAttribute("data", "Hello!");
    }


}
