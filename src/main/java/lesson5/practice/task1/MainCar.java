package lesson5.practice.task1;

public class MainCar {
    public static void main(String[] args) {

        Engine engine = new Engine(104, "Kama");
        Driver driver = new Driver(25, "Speedy Good", 30);

        Car car = new Car("CoolAuto", engine, driver, "Marusy");
        Car lorry = new Lorry("Track", engine,driver,"Kamaz", 100);

        DriveCar driveCar = new DriveCar();

        driveCar.moveCar(car);
        driveCar.moveCar(lorry);
    }
}
