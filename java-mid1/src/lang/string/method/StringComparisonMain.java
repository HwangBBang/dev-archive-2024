package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, World";
        String str2 = "hello, world";
        String str3 = "Hello, JAVA";

        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnorecase str2: " + str1.equalsIgnoreCase(str2));
        System.out.println("str1 equals str3: " + str1.equals(str3));

        System.out.println("'A' compareTo 'C': " + "A".compareTo("C"));
        System.out.println("'C' compareTo 'A': " + "C".compareTo("A"));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));
        System.out.println("str1 compareTo str2: " + str1.compareToIgnoreCase(str2));


        System.out.println("str1 starts with 'Hello': " + str1.startsWith("Hello"));
        System.out.println("str3 ends with 'JAVA': " + str3.endsWith("JAVA"));

    }
}
