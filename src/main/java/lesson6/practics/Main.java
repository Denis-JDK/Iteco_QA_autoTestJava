package lesson6.practics;

import lesson6.practics.task1.GenericsNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<String> list = Arrays.asList(" Yes", "No","ETS", " Jor","test");
        List<Long> numberList = Arrays.asList(2L,45L,76L, 21L,85L);

        GenericsNumber.sortNumbers(list);
        GenericsNumber.sortNumbersNumber(numberList);

        List<Integer>listEntry=new ArrayList<>();
        //List<Integer>listEntry=List.of(1,2); ошибка не изменяемый список будет имутабельный exeption
        listEntry.add(1);
        listEntry.add(2);
        List<Integer>listEntry1=new ArrayList<>();
        //List<Integer>listEntry1=List.of(3,4); ошибка не изменяемый список будет имутабельный exeption
        listEntry1.add(3);
        listEntry1.add(4);

        List<Integer> result = GenericsNumber.joinGroup(listEntry,listEntry1);
        result.forEach(element -> System.out.println(element));

        System.out.println("-------------------------------------------------------------------");

        Cat cat = new Cat();
        Camel camel = new Camel();
        AnimalProcessor animalProcessorForCat = new AnimalProcessor<Cat>();
        AnimalProcessor <Camel> animalProcessorForCamel = new AnimalProcessor();

        animalProcessorForCat.goToHome(cat);
        animalProcessorForCat.goToHospital(cat);
        animalProcessorForCamel.goToHome(camel);
        animalProcessorForCamel.goToHospital(camel);

    }




}
