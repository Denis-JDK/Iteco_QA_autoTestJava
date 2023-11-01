package lesson7.patern.builder;

public interface Builder {
    void setName(String name);
    void setType(String type);
    Builder setColor(String color);
    Builder setSize(String size);
    Builder setAge(int age);
}
