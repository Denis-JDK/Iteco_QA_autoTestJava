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

    }
}
