package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // Int 최고값
        long maxIntOver = 2147483649L; // Int 최고값 + 1(초과)

        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver; // 형변환
        System.out.println("maxIntOver casting = " + intValue);

        /* int < long < double */

    }
}
