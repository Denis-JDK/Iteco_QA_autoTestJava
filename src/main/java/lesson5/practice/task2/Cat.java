package lesson5.practice.task2;

import lesson5.practice.task1.Location;

public class Cat extends Animal {
    private String name;
    private SizeAnimal size;

    public Cat(String food, Location location, String name, SizeAnimal size) {
        super(food, location);
        this.name = name;
        this.size = size;
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " мяукает.");
    }

    @Override
    public void eat() {
        System.out.println("Cat"+ super.getFood() + " ест");
    }
}
