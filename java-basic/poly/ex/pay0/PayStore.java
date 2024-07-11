package poly.ex.pay0;

public abstract class PayStore { // 결제 수단을 보관하는 추상 클래스
    public static Pay findPay(String option) {
        if (option.equals("kakao")) {return new KakaoPay();}
        else if (option.equals("naver")) {return new NaverPay();}
        else if (option.equals("toss")) { return new TossPay();}
        else if (option.equals("hana")) { return new HanaPay();}
        else {return new DefaultPay();}
    }

}
