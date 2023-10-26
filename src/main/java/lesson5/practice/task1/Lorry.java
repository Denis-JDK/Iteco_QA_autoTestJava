package lesson5.practice.task1;

public class Lorry extends Car{
    private int carrying;

    public Lorry(String carClass, Engine engine, Driver driver, String marka, int carrying) {
        super(carClass, engine, driver, marka);
        this.carrying = carrying;
    }

    @Override
    public void start() {
        System.out.println("Поехал грузовик!");
    }

    @Override
    public void stop() {
        System.out.println("Останавливается грузовик!");
    }

    @Override
    public void turnRight() {
        super.turnRight();
    }

    @Override
    public void turnLeft() {
        super.turnLeft();
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                '}';
    }
}
