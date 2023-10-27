package lesson5.practice.task2;

import lesson5.practice.task1.Location;

public class Animal {
    private String food;
    private Location location;

    public Animal(String food, Location location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public Location getLocation() {
        return location;
    }

    public void makeNoise(){
        System.out.println(" животное спит");
    }

    public void eat(){

    }
    public void sleep(){
        System.out.println("Животное спит");

    }
}
