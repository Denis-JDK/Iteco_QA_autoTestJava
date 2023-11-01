package lesson7.patern.builder;

public class Main {
    public static void main(String[] args) {
        BuilderCat builder = new BuilderCat();
        // позводяет инициализировать поля Cat  в любом порядке и любые поля. А не строго последовательно как в конструкторе Cat.
        builder.setAge(3);
        builder.setSize("Small");

        Cat cat = builder.getResult();
        System.out.println(cat);


        //чтоб вызывать методы цепочкой через точку необходимо чтоб методы BuildCat
        // возвращали туже сущность, были не void а return this.
        Cat catBuild = new BuilderCat()
                .setColor("Grey")
                .setAge(2)
                .setSize("Big")
                .getResult();
    }
}
