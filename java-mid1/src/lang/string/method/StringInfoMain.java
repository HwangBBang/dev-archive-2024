package lang.string.method;

public class StringInfoMain {
    public static void main(String[] args) {
        String str = "Hello, Java!";
        System.out.println("문자열의 길이 : " + str.length());
        System.out.println("문자열이 비어있는지 : " + str.isEmpty());
        System.out.println("문자열이 비어있는지 : " + "".isEmpty());
        System.out.println("문자열이 공백인지 : " + str.isBlank());
        System.out.println("문자열이 공백인지 : " + "   ".isBlank());

        char c = str.charAt(4);
        System.out.println("4번 인덱스 문자 = " + c);


    }
}
