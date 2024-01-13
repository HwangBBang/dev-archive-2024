package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;
        /* int < long < double */

        //작은 놈을 큰놈에 넣는 것 OK!
        longValue = intValue;
        System.out.println("longValue = " + longValue);

        //      작은 놈을 큰놈에 넣는 것 OK!
        doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue);

        //      작은 놈을 큰놈에 넣는 것 OK!
        longValue = 30L;
        doubleValue = longValue;
        System.out.println("doubleValue = " + doubleValue);

    }
}
