package hello.servlet.web.frontcontroller.v2;

import hello.servlet.web.frontcontroller.MyView;
import hello.servlet.web.frontcontroller.v2.controller.MemberFormControllerV2;
import hello.servlet.web.frontcontroller.v2.controller.MemberListControllerV2;
import hello.servlet.web.frontcontroller.v2.controller.MemberSaveControllerV2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "frontControllerServletV2", urlPatterns = "/front-controller/v2/*")
public class FrontControllerServletV2 extends HttpServlet{

        // URL : 컨트롤 => 어떤 URL 넣으면 ControllerV1을 호출해 !
        private Map<String, ControllerV2> controllerMap = new HashMap<>();

        public FrontControllerServletV2() {
            controllerMap.put("/front-controller/v2/members/new-form", new MemberFormControllerV2());
            controllerMap.put("/front-controller/v2/members/save", new MemberSaveControllerV2());
            controllerMap.put("/front-controller/v2/members", new MemberListControllerV2());
        }

        @Override
        protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            System.out.println("FrontControllerServletV2.service");

            // localhost 뒷단의 URI를 얻어올 수 있음
            // ex) /front-controller/v1/members/new-form
            String requestURI = request.getRequestURI();
            // ex) /front-controller/v1/members/new-form 에 해당하는 controller 가 찾아진다.
            ControllerV2 controller = controllerMap.get(requestURI);
            if (controller == null) {
                response.setStatus(HttpServletResponse.SC_NOT_FOUND); // 해당 컨트롤러가 없다면 404
                return;
            }
            // 아래로 내려온다면 잘 조회가 된 것
            MyView view = controller.process(request, response);
            view.render(request,response);
        }

    }


