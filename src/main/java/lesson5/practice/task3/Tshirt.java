package lesson5.practice.task3;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{
    public Tshirt(Size size, Integer coast, String color) {
        super(size, coast, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Tshirt coast "+ super.getCoast() + ", цвет " + super.getColor());
    }

    @Override
    public void dressWomen() {
        System.out.println("Tshirt coast "+ super.getCoast() + ", цвет " + super.getColor());
    }
}
