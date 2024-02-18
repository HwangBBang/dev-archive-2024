package hello.servlet.basic.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "responseHeaderServlet", urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //[Status-line]
        //resp.setStatus(200); // 응답 메시지의 http 상태 코드 세팅
        resp.setStatus(HttpServletResponse.SC_OK);
        //[response-header]
        resp.setHeader("Content-Type","text/plain;charset=utf-8");
        resp.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");// 캐시 완전 무효화
        resp.setHeader("Pragma", "no-cache");// 캐시 완전 무효화
        resp.setHeader("my-header","hello");// 내가만든 임의의 헤더

        //[Header의 편의 메서드]
//        content(resp);
//        cookie(resp);
        redirect(resp);
        resp.getWriter().write("OK");
    }

    // 컨텐트 관련 메서드
    private void content(HttpServletResponse response) {
    //Content-Type: text/plain;charset=utf-8
    //Content-Length: 2
    //response.setHeader("Content-Type", "text/plain;charset=utf-8");
     response.setContentType("text/plain");
     response.setCharacterEncoding("utf-8");
     //response.setContentLength(2); //(생략시 자동 생성)
    }
    // 쿠키 관련 메서드
    private void cookie(HttpServletResponse response) {
        //Set-Cookie: myCookie=good; Max-Age=600;
        //response.setHeader("Set-Cookie", "myCookie=good; Max-Age=600");
        Cookie cookie = new Cookie("myCookie", "good");
        cookie.setMaxAge(600); //600초
        response.addCookie(cookie);
    }
    // 리다이렉트 관련 메서드
    private void redirect(HttpServletResponse response) throws IOException {
        //Status Code 302
        //Location: /basic/hello-form.html
        //response.setStatus(HttpServletResponse.SC_FOUND); //302
        //response.setHeader("Location", "/basic/hello-form.html");
        response.sendRedirect("/basic/hello-form.html");
    }

}
