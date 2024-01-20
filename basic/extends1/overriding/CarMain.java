package extends1.overriding;


public class CarMain {
    public static void main(String[] args) {
        GasCar gasCar = new GasCar();
        ElectricCar electricCar = new ElectricCar();

        gasCar.move();
        electricCar.move();

    }
}
