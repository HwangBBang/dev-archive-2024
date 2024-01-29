package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;


public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member hwangbbang = new Member(1L, "hwangbbang", Grade.VIP);
        memberService.join(hwangbbang);

        Member findMember = memberService.findMember(hwangbbang.getId());
        System.out.println("new member = " + hwangbbang.getName());
        System.out.println("findMember = " + findMember.getName());
    }
}
