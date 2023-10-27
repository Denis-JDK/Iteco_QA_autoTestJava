package lesson5.practice.task4;

import java.util.List;

public class Book implements Printable{
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void printBooks(List<Printable> printable){
        for (Printable printable1 : printable) {
            if (printable1 instanceof Book){
                System.out.println(((Book) printable1).getName());
            }

        }
    }

    @Override
    public void print() {
        System.out.println("Print book");

    }
}
