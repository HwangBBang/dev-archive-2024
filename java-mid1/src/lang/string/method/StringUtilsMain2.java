package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        // format 메서드
        String formatted1 = String.format("num : %d \n" +
                "bool : %b \n" +
                "str : %s", num, bool, str);
        System.out.println(formatted1);


        String formatted2 = String.format("%.2f", 12.467);
        System.out.println("formatted2 = " + formatted2);

        // matches 메서드
        String regex = "Hello, (Java|World)!";
        System.out.println("str 이 정규 표현식의 패턴과 일치하는가? = " + str.matches(regex));
        

    }
}
