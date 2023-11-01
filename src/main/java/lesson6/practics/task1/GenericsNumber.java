package lesson6.practics.task1;

import java.util.ArrayList;
import java.util.List;

public class GenericsNumber <T>{
//четные элементы по индексу
    public static  <T> List<T> sortNumbers(List <T> list){
        List<T> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i = i+2) {
            list1.add(list.get(i));
            System.out.println(list.get(i));
        }
        return list1;
        }
    //четные элементы по значению
        public static <T>List<T>sortNumbersNumber(List<? extends Number> list){
            List<T> list2= new ArrayList<>();
            list.forEach(element -> {
                if(element.doubleValue() % 2 == 0) {
                    list2.add((T)element);
                    System.out.println(element);
                }
            });
            return list2;

        }
        //обьединение двух групп в одну
        public static<T> List<T> joinGroup(List<T> group, List<T> group1){
        group.addAll(group1);
        return group;
        }

}
