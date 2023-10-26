package lesson5.practice.task3;

public abstract class Clothes {
    private Size size;
    private Integer coast;
    private String color;

    public Clothes(Size size, Integer coast, String color) {
        this.size = size;
        this.coast = coast;
        this.color = color;
    }
    public void dressMan(){

    }
    public void dressWomen(){

    }

    public Size getSize() {
        return size;
    }

    public Integer getCoast() {
        return coast;
    }

    public String getColor() {
        return color;
    }
}
