package lesson4.task3;

public class MainStudent {
    public static void main(String[] args) {
        //    Создайте пример наследования, реализуйте класс Student и класс Aspirant,
//    аспирант отличается от студента наличием некой научной работы.
//    а) Класс Student содержит переменные: String firstName, lastName, group.
//    А также, double averageMark, содержащую среднюю оценку.
//    б) Создать переменную типа Student, которая ссылается на объект типа Aspirant.
//    в) Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
//    Если средняя оценка студента равна 5, то сумма 100 грн, иначе 80.
//    Переопределить этот метод в классе Aspirant. Если средняя оценка аспиранта равна 5, то сумма 200 грн, иначе 180.
//    г) Создать массив типа Student, содержащий объекты класса Student и Aspirant.
//    Вызвать метод getScholarship() для каждого элемента массива.

        Student student = new Aspirant("Aspirant","Arestotely",54,4,"Problems of the world");
        Integer result = student.getScholarship(student);
        System.out.println(result);




    }
}
