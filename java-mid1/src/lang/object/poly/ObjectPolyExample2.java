 package lang.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Car car = new Car();
        Dog dog = new Dog();
        Object object = new Object();

        Object[] objects = {car,dog,object};

//        Object[] objects = new Object[3];
//        objects[0] = car;
//        objects[1] = dog;
//        objects[2] = objects;

        size(objects);

    }

    private static void size(Object[] objects) {
        System.out.println("Objects size is : " + objects.length);
    }

    private static void action(Object object) {
        // 객체에 맞는 다운 캐스팅이 필요하다.
        if (object instanceof Dog dog) {
            dog.sound();
        } else if (object instanceof Car car){
            car.move();
        }
    }
}
