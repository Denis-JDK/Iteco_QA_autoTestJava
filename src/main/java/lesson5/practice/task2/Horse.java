package lesson5.practice.task2;

import lesson5.practice.task1.Location;

public class Horse extends Animal{
    private int speed;
    public Horse(String food, Location location, int speed) {
        super(food, location);
        this.speed = speed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse "+ speed + " гавкает.");
    }

    @Override
    public void eat() {
        System.out.println("Horse "+ super.getFood() + " ест.");
    }
}
