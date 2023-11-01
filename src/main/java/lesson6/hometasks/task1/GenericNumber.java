package lesson6.hometasks.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenericNumber {

    //    Напишите общий методы для подсчета количества элементов в коллекции, обладающих определенным свойством.
//    Аргумент дженерик методов  - список элементов типа Type, возвращается - количество элементов, которые являются:
//    1) нечетными целыми числами
//    2) простыми числами
//

    //task2
    // Напишите общий метод для обмена позициями двух разных элементов в массиве.
    //Аргументы дженерик метода: список с элементами типа Type, индекс элемента a, индекс элемента b.
    //Результат - поменять значения элементов a и b местами в списке.
    public static <T> List <T> getGenericNumber(List<? extends Number> list){
        List<T>result=new ArrayList<>();
        list.forEach(it-> {
            if (it.doubleValue() % 2 == 1 || it.doubleValue() % 1 == 0) {
                result.add((T) it);
            }
        });
            return result;
    }
    public static <T>List<T> chengArrayElements(List<T> list){
        for (int i = 0; i < list.size(); i+=2) {
            T temp = list.get(i);
            list.set(i, list.get(i+1));
            list.set(i+1, temp);
        }
        return list;

    }



    public static void main(String[] args) {

        List<Double> list = Arrays.asList(1.0,2.6,3.6,6.6,7.0,8.5,9.0,76.0);
        List<Integer> listInt = Arrays.asList(1,2,3,6);
       // list.stream().forEach(it-> System.out.println(it));
        List<Double> result = getGenericNumber(list);
        result.stream().forEach(it-> System.out.println(it));

        List<Integer>integerList= new ArrayList<>();
        integerList.add(1);
        integerList.add(8);
        integerList.add(5);
        integerList.add(87);
        integerList.add(33);
        integerList.add(109);
        List<Integer> res = chengArrayElements(integerList);
        res.forEach(it-> System.out.println(it));




    }


}
