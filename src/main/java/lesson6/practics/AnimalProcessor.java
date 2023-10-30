package lesson6.practics;

public class AnimalProcessor<T> {
    public void goToHospital(T animal){
        System.out.println("Go to hospital " + animal.toString());
    }
    public void goToHome(T animal){
        System.out.println("Go to home " + animal.toString());
    }
}
