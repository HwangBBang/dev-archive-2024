package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        /* int < long < double */

        //intValue = doubleValue; // 컴파일 오류 double -> int
        intValue = (int) doubleValue; // 강제 캐스팅
        System.out.println("intValue = " + intValue);
        System.out.println("doubleValue = " + doubleValue);
    }
}
