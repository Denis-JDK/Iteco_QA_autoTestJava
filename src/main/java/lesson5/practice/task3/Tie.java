package lesson5.practice.task3;

public class Tie extends Clothes implements ManClothes{

    public Tie(Size size, Integer coast, String color) {
        super(size, coast, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Tie coast "+ super.getCoast() + ", цвет " + super.getColor());
    }
}
