package lesson7.patern;

public final class Singleton {
    private static Singleton instance;
    private String value;


    private Singleton(String value){
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(){
        if (instance==null)
            instance = new Singleton("One Singleton");

            return instance;
    }

}
