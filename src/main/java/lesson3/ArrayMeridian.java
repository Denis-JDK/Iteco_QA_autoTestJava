package lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMeridian {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,3);
        List<Integer> list2 = Arrays.asList(2);
        List<Integer> result = new ArrayList<>();

        int point1=0;
        int point2=0;

       while (point1 < list1.size()&&point2<list2.size()){

                if (list1.get(point1)<list2.get(point2)){
                    result.add(list1.get(point1));
                    point1++;
                }else {
                    result.add(list2.get(point2));
                    point2++;
                }
        }
        extracted(list1, result, point1);
        extracted(list2, result, point2);

        for (Integer integer:result) {
            System.out.println(integer);
        }

    }

    private static void extracted(List<Integer> list1, List<Integer> result, int point1) {
        while (point1 < list1.size()){
            result.add(list1.get(point1));
            point1++;
        }
    }
}
