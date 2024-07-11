package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("model Y");
        Dog dog = new Dog("뽀삐", 2);
//        System.out.println(car);
//        System.out.println(dog);

//        ObjectPrinter.print(car);
//        String refValue1 = Integer.toHexString(System.identityHashCode(car));
//        System.out.println(refValue1);
//
//        ObjectPrinter.print(dog);
//        String refValue2 = Integer.toHexString(System.identityHashCode(dog));
//        System.out.println(refValue2);
//
//        car.toString();

        int num = 3;

        switch (num){
            case 1:
                System.out.println("num : " + (num+2));
            case 2:
                System.out.println("num : " + (num+1));
            case 3:
                System.out.println("num : " + (num+3));
            default:
                System.out.println("num : " + (num));

        }

        for (int i = 1; i < 10; i++) {

        }
    }


}
