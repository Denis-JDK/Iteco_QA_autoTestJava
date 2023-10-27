package lesson5.practice.task2;

public class Veterinarian {

    public void treatAnimal(Animal animal){
        System.out.println("Животное пришло на прием: ест " + animal.getFood() +
                ", " +" и находится " + animal.getLocation());
    }
}
