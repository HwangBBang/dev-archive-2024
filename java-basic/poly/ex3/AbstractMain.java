package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        // 추상 클래스 는 인스턴스 생성 불가
        //Animal animal = new Animal();//Animal is abstract; cannot be instantiated
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        dog.sound();dog.move();
        cat.sound();cat.move();
        caw.sound();caw.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
