package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String str = "     JAVA Programming   ";
        System.out.println("소문자 변환 : " + str.toLowerCase());
        System.out.println("대문자 변환 : " + str.toUpperCase());
        System.out.println("공백 제거 (trim) : " + str.trim());
        System.out.println("공백 제거 (strip) : " + str.strip());
        System.out.println("앞 공백 제거 (strip) : " + str.stripLeading());
        System.out.println("뒷 공백 제거 (strip) : " + str.stripTrailing());




    }
}
