package operator;

public class Comp1 {
    public static void main(String[] args) {
        String str1 = "문자열1";
        String str2 = "문자열2";

        // 문자열 리터럴, 문자열 리터럴 비교
        boolean result1 = "Hello".equals("Hello");

        // 문자열 변수, 리터럴 비교
        boolean result2 = str1.equals("문자열1");

        // 문자열 변수, 문자열 변수 비교
        boolean result3 = str1.equals(str2);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

    }
}
