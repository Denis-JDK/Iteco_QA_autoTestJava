package lesson4.task3;

public class Student {

private String name;
private String lastname;
private Integer group;
private double averageMark;

    public Student(String name, String lastname, Integer group, double averageMark) {
        this.name = name;
        this.lastname = lastname;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Integer getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public Integer getScholarship(Student student){
        if (student.getAverageMark()==5)
            return 100;
        return 80;
}

}
