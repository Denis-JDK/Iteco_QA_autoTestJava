package lesson2;

public class HelloWorld {

    public static void main(String[] args) {

        //составьте программу. выводящую на экран квадраты чисел 10 до 20.
        int number;
        for (number = 0; number <= 20; number++) {
            System.out.println(number * number);
        }
        //составить программу, которая заменяет все точки на пробелы.
        String str = "Java.I.Wont.And.I.Do.Good.Use.Java.Build_All";

        int indexOfNewWord = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ('.')) {
                builder.append(str.substring(indexOfNewWord, i));
                builder.append(" "); //заменяем точку на пробел
                indexOfNewWord = i + 1;
            }
        }
        builder.append(str.substring(indexOfNewWord, str.length())); // чтоб и после последней точки распечатать Build_ALL
        System.out.println(builder.toString());

        //дано натуральное n число надо вычесллить 1/1 + 1/2 + 1/3 .. 1/n

        int n = 10;
        double sum = 0;
        for (int i = 1; i<=n;i++){
            sum= sum + (double)1/i;
        }
        System.out.println(sum);

        //посчитать количество положительных и отрицательных чисел

        String string = "3 4 -7  4";
        int countOfNegative=0;
        int countOfPositive=0;

        if (string.length()>=1 &&string.charAt(0)=='-'){
            countOfNegative++;
        }else {
            countOfPositive++;
        }

        for (int i =0; i<string.length(); i++){
            if (string.charAt(i)==' ' && string.length()>=2) {
                if (string.length()>i && string.charAt(i + 1) == '-') {
                    countOfNegative++;
                }else {
                    countOfPositive++;
                }
            }
        }
        System.out.println("Положительных чисел: "+ countOfPositive + "\n" + "Оотрицательных чисел: " +countOfNegative);

        //посчитать вхождение строки а в строку b
        String a = "ab";
        String b = "abc baab baab";

        int count = 0;
        for (int i = 0; i<b.length();i++){
            if (i+a.length()<=b.length()) {
                String substring = b.substring(i, a.length() + i);
                if (substring.equals(a)) {
                    count++;
                }
            }
        }
        System.out.println(count);


        int countNew=0;

        for (int i = 0; i < b.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                if (b.charAt(i+j)!=a.charAt(j)){
                    break;
                }
                if (j == a.length()-1){
                    countNew++;
                }
            }
        }
        System.out.println(countNew);

        int s = 10;

        for (int i = 0; i < s; i++) {
            if (i%2!=0 && i%3!=0 && i%5!=0){
                System.out.println(i);
            }

        }

    }

}
