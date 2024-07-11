package lang.string.method;

public class StringChangeMain1 {
    public static void main(String[] args) {
        String str = "Hello, JAVA! Welcome to JAVA World!";
        System.out.println("인덱스 7 부터의 문자열 : " + str.substring(7));
        System.out.println("인덱스 7 부터 12 의 문자열 : " + str.substring(7,12));

        System.out.println("문자열 결합 : " + str.concat("!!!!!!!!!!!"));
        System.out.println("'JAVA'를 Python 으로 대체 : " + str.replace("JAVA","Python"));
        System.out.println("첫 번째 'JAVA'만 Python 으로 대체 : " + str.replaceFirst("JAVA","Python"));

    }
}
