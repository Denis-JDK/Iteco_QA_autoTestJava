package lesson2;

public class DuplicateSpaces {

    public static void main(String[] args) {

        String yourString = "I have lern  Java good         work  and  company.";
       String result =yourString.replaceAll("\\s+", " ");

        System.out.println(result);
    }
}
