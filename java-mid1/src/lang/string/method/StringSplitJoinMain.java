package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";
        String[] splits = str.split(",");
        for (String s : splits) {
            System.out.println(s);
        }

        String join = String.join(", ", splits);
        System.out.println(join);
    }
}
