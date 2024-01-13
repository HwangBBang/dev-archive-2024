package cond;

public class CondOp1 {
    public static void main(String[] args) {
//
        int age = 8;
        String status;
//        if (age >= 18) {
//            status = "성인";
//        } else {
//            status = "민짜";
//        }
        status = (age >= 18) ? "성인" : "민짜";
        System.out.println(status);
    }
}
