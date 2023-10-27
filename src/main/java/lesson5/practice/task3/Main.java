package lesson5.practice.task3;

import java.util.Arrays;
import java.util.List;

public class Main {

//    Создать перечисление, содержащее размеры одежды (XXS, XS, S, M, L).
//    Перечисление содержит метод getDescription, возвращающий строку "Взрослый размер".
//    Переопределить метод getDescription - для константы XXS метод должен возвращать строку “Детский размер”.
//    Также перечисление должно содержать числовое значение euroSize(32, 34, 36, 38, 40), соответствующее каждому размеру.
//    Создать конструктор, принимающий на вход euroSize.
//    Создать интерфейсы "Мужская Одежда" с методом "одетьМужчину" и "Женская Одежда" с методом "одетьЖенщину".
//    Создать абстрактный класс Одежда, содержащий переменные - размер одежды, стоимость, цвет.
//    Создать классы наследники Одежды - Футболка (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"),
//    Штаны (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"), Юбка (реализует интерфейсы "Женская Одежда"),
//    Галстук (реализует интерфейсы "Мужская Одежда").
//    Создать массив, содержащий все типы одежды. Создать класс Ателье, содержащий методы "одетьЖенщину",
//    "одетьМужчину", на вход которых будет поступать массив, содержащий все типы одежды. Метод "одетьЖенщину"
//    выводит на консоль всю информацию о женской одежде. То же самое для метода "одетьМужчину".
//    Подсказка: Задание №1 разбирали на практике.
    public static void main(String[] args) {
        System.out.println(Size.S.getDescription());
        System.out.println(Size.S.getEuroSize());
        System.out.println(Size.XXS.getDescription());


        Tshirt tshirt = new Tshirt(Size.L, 150, "Red");
        Skirt skirt = new Skirt(Size.S, 300, "Blue");
        Trousers trousers = new Trousers(Size.M, 350, "Gre");
        Tie tie = new Tie(Size.XS, 200, "Orange");

        List<WomenClothes> clothesWomen= Arrays.asList(skirt,trousers);
        List<ManClothes> clothesMan= Arrays.asList(trousers,tshirt,tie);



        List<Clothes> list = Arrays.asList(tie,tshirt,skirt,trousers, tie);

        MakeClothes manClothes = new MakeClothes();
        manClothes.dressMan(list);

        manClothes.dressMan(clothesWomen, clothesMan);

        }
}
