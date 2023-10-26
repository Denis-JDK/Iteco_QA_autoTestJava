package lesson5.practice.task2;

import lesson5.practice.task1.Location;

public class Dog extends Animal{
    private int aeg;
    public Dog(String food, Location location, int age) {
        super(food, location);
        this.aeg = age;
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog "+ aeg + " гавкает.");
    }

    @Override
    public void eat() {
        System.out.println("Dog "+ super.getFood() + " ест.");
    }
}
