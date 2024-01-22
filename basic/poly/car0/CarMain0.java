package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        driver.setK3Car(new K3Car());
        driver.drive();

        driver.setK3Car(null);
        driver.setModel3Car(new Model3Car());
        driver.drive();

    }
}
