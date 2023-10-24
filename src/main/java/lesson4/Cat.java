package lesson4;

public class Cat {
    private String name;
    private CatType type;

    public Cat(String name, CatType type) {
        this.name = name;
        this.type = type;
    }

    public Cat(){
        this("cat", CatType.HOMELESS);
    }

    public Cat(String name){
        this(name, CatType.HOMELESS);
    }
}
