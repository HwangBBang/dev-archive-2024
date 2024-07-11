package extends1.ex3;


public class CarMain {
    public static void main(String[] args) {
        GasCar gasCar = new GasCar();
        ElectricCar electricCar = new ElectricCar();
        HydrogenCar hydrogenCar = new HydrogenCar();

        gasCar.move();
        electricCar.move();
        hydrogenCar.move();

        gasCar.openDoor();
        electricCar.openDoor();
        hydrogenCar.openDoor();


        gasCar.fillUp();
        electricCar.charge();
        hydrogenCar.fillHydrogen();


    }
}
