package poly.ex6;

public class Dog extends AbstractAnimal{
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
    public void move() {
        System.out.println("멍멍이 걷기");
    }
}
