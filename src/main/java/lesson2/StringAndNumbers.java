package lesson2;

public class StringAndNumbers {

    public static void main(String[] args) {
        String str = "orange 1 and potato 2345";

        long count = str.codePoints().filter(Character::isDigit).count();
        System.out.println(count);
    }
}
