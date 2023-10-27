package lesson4.task3;

public class Aspirant extends Student{
    private String work;
    public Aspirant(String name, String lastname, Integer group, double averageMark, String work) {
        super(name, lastname, group, averageMark);
        this.work = work;
    }

    public String getWork() {
        return work;
    }
    public Integer getScholarship(Student student) {
        if (student.getAverageMark() == 5)
            return 200;
        return 180;

    }
}
