package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차량 선택
        Car car = new K3Car();
        driver.setCar(car);
        driver.drive();


        // 차량 변경
        driver.setCar(new Model3Car());
        driver.drive();

        // 차량 변경
        driver.setCar(new BenzCar());
        driver.drive();
    }
}
