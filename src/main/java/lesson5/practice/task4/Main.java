package lesson5.practice.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
//    Определить интерфейс Printable, содержащий метод void print().
//    Определить класс Book, реализующий интерфейс Printable.
//    Определить класс Magazine, реализующий интерфейс Printable.
//    Создать массив типа Printable, который будет содержать книги и журналы.
//    В цикле пройти по массиву и вызвать метод print() для каждого объекта.
//    Создать статический метод printMagazines(Printable[] printable) в классе
//    Magazine, который выводит на консоль названия только журналов.
//    Создать статический метод printBooks(Printable[] printable) в
//    классе Book, который выводит на консоль названия только книг.
//    Используем оператор instanceof для определения типа.

    public static void main(String[] args) {

        Book book = new Book("War of Peace");
        Magazine magazine = new Magazine("Age Like");

        List<Printable>list= Arrays.asList(book,magazine);
        list.forEach(it->it.print());

        Magazine.printMagazines(list);
        Book.printBooks(list);



    }
}
