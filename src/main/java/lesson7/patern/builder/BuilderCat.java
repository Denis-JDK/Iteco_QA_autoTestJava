package lesson7.patern.builder;

public class BuilderCat implements Builder{
    private String name;
    private String type;
    private String color;
    private String size;
    private int age;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public BuilderCat setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public BuilderCat setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public BuilderCat setAge(int age) {
        this.age = age;
        return this;
    }

    public Cat getResult(){
        return new Cat(this.name,this.type,this.color,this.size,this.age);
    }
}
