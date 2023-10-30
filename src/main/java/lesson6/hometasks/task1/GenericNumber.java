package lesson6.hometasks.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericNumber {

    //    Напишите общий методы для подсчета количества элементов в коллекции, обладающих определенным свойством.
//    Аргумент дженерик методов  - список элементов типа Type, возвращается - количество элементов, которые являются:
//    1) нечетными целыми числами
//    2) простыми числами
//
    public static <T> List <T> getGenericNumber(List<? extends Number> list){
        List<T>result=new ArrayList<>();
        list.forEach(it-> {
            if (it.doubleValue() % 2 == 1 || it.doubleValue() % 1 == 0) {
                result.add((T) it);
            }
        });
            return result;
    }


    public static void main(String[] args) {

        List<Double> list = Arrays.asList(1.0,2.6,3.6,6.6,7.0,8.5,9.0,76.0);
        List<Integer> listInt = Arrays.asList(1,2,3,6);
       // list.stream().forEach(it-> System.out.println(it));
        List<Double> result = getGenericNumber(list);
        result.stream().forEach(it-> System.out.println(it));

    }


}
