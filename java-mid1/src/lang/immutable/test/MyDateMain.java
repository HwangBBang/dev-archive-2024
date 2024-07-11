package lang.immutable.test;

public class MyDateMain {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(2024, 7, 11);
        MyDate cloneDate = myDate;

        System.out.println(myDate);
        System.out.println(cloneDate);

        cloneDate.setYear(2025);

        System.out.println(myDate);
        System.out.println(cloneDate);

    }
}
