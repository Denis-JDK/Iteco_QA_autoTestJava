package lesson5.practice.task2;

import lesson5.practice.task1.Location;

import java.util.Arrays;
import java.util.List;

public class MainAnimal {
    public static void main(String[] args) {

        Animal cat = new Cat("kitkat", Location.HOME,"Cat", SizeAnimal.SMAll);
        Animal dog = new Dog("pedigri",Location.HOME, 7);
        Animal horse = new Horse("food horse", Location.EUROPE, 45);

        List<Animal> list = Arrays.asList(cat,dog,horse);
        Veterinarian veterinarian = new Veterinarian();

        list.forEach(it-> veterinarian.treatAnimal(it));


    }
}
