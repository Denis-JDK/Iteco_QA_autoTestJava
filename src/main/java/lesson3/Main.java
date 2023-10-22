package lesson3;

public class Main {
    public static void main(String[] args) {
        TaskSumAndTarget task = new TaskSumAndTarget();
        int[] sum = {1, 3, 6, 7, 3, 2};
        int target = 9;

        int [] array = task.numbersIndexSumTarget(sum, target);

        DoubleNumbersOfListToSet db = new DoubleNumbersOfListToSet();
        db.checkNameAndGenerate("Ivan");

    }
}
