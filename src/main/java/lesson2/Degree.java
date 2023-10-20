package lesson2;

public class Degree {
    public static void main(String[] args) {
        int count = 9;

        if (count%2 == 0) {
            double result = Math.pow(count, 10);
            System.out.println(result);
        } else {
            double result = Math.pow(count, 3);
            System.out.println(result);
        }

    }
}
