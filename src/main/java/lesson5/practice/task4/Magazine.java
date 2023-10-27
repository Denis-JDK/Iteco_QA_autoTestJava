package lesson5.practice.task4;

import java.util.List;

public class Magazine implements Printable{
    private String name;


    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void printMagazines(List<Printable> printable){
        for (Printable printable1 : printable) {
            if (printable1 instanceof Magazine){
                System.out.println(((Magazine) printable1).getName());
            }
        }

    }
    @Override
    public void print() {
        System.out.println("Print magazine");

    }
}
