package lesson5.practice.task1;

public class SuperCar extends Car{
    private double speed;

    public SuperCar(String carClass, Engine engine, Driver driver, String marka, double speed) {
        super(carClass, engine, driver, marka);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SuperCar{" +
                "speed=" + speed +
                '}';
    }
}
