package poly.car1;

public class BenzCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("BenzCar.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("BenzCar.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("BenzCar.pressAccelerator");
    }
}
