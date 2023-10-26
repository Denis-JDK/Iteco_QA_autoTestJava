package lesson5.practice.task3;

public class Skirt extends Clothes implements WomenClothes{
    public Skirt(Size size, Integer coast, String color) {
        super(size, coast, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Skirt coast "+ super.getCoast() + ", цвет " + super.getColor());
    }
}
