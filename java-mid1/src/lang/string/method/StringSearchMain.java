package lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hello, JAVA! Welcome to JAVA world";

        System.out.println("문자열에 'JAVA'가 포함되어있는지? : " + str.contains("JAVA"));
        System.out.println("문자열에 'JAVA'의 첫 번째 인덱스 : " + str.indexOf("JAVA"));
        System.out.println("문자열의 인데스 10 부터'JAVA'의 인덱스 : " + str.indexOf("JAVA",10));

    }
}
