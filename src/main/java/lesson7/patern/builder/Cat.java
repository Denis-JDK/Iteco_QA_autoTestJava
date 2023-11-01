package lesson7.patern.builder;

public class Cat {
    private String name;
    private String type;
    private String color;
    private String size;
    private int age;

    public Cat(String name, String type, String color, String size, int age) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.size = size;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                '}';
    }
}
