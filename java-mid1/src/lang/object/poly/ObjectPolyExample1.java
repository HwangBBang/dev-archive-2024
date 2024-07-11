package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Car car = new Car();
        Dog dog = new Dog();

        action(car);
        action(dog);
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
