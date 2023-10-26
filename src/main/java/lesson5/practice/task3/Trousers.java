package lesson5.practice.task3;

public class Trousers extends Clothes implements ManClothes, WomenClothes{
    public Trousers(Size size, Integer coast, String color) {
        super(size, coast, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Trousers coast "+ super.getCoast() + ", цвет " + super.getColor());
    }

    @Override
    public void dressWomen() {
        System.out.println("Trousers coast "+ super.getCoast() + ", цвет " + super.getColor());
    }
}
