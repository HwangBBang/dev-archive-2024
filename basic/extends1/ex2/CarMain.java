package extends1.ex2;



public class CarMain {
    public static void main(String[] args) {
        GasCar gasCar = new GasCar();
        ElectricCar electricCar = new ElectricCar();

        gasCar.move();
        electricCar.move();

        gasCar.fillUp();
        electricCar.charge();

    }
}
