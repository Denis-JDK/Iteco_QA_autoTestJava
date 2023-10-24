package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Fred","AS",3, Arrays.asList(1,3,5,4)));
        students.add(new Student("Tom","GS",1,Arrays.asList(4,5,5,5,4)));
        students.add(new Student("Helen","LE",7,Arrays.asList(4,5,4,5,4)));

        for (Student student: students){
            if (student.averageMark()>=4)
            System.out.println("Имя "+student.getSurname()+" "+student.getAbb()+" номер группы "+student.getGroupNumber());
        }

        Variable variable = new Variable();
        variable.setA(3);
        variable.setB(5);

        variable.printA();
        variable.printB();
        System.out.println(variable.sumVariable());
        System.out.println(variable.maxVariable());


        Counter counter1=new Counter();
        Counter counter2=new Counter(11);

        System.out.println(counter1.getCurrentValue());
        System.out.println(counter2.getCurrentValue());

        DynamicArray dynamicArray=new DynamicArray();
        DynamicArray dynamicArray1=new DynamicArray(4);

        dynamicArray.generateRandomArray(5);
        dynamicArray1.generateRandomArray(7);
    }



}
