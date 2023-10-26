package lesson5.practice.task1;

public class Lorry extends Car{
    private int carrying;

    public Lorry(String carClass, Engine engine, Driver driver, String marka, int carrying) {
        super(carClass, engine, driver, marka);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
