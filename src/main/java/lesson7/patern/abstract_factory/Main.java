package lesson7.patern.abstract_factory;

public class Main {
    public static void main(String[] args) {
        Application application = new Application(new WindowsFactory());//MacOSFactory
        application.paint();
    }
}
