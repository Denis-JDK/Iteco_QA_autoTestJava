package lesson3;

import java.util.*;

public class DoubleNumbersOfListToSet {

    public static void main(String[] args) {

        DoubleNumbersOfListToSet df = new DoubleNumbersOfListToSet();
        boolean answer = df.registerUser(" ");
        System.out.println(answer);

        //Получаем на вход массив целочисленных чисел,
        //получить и вывести количество повторяющихся чисел в формате первое число повтор, второе количество повторов 53
        List<Integer> list = Arrays.asList(1, 2, 5, 5, 5, 6, 8, 9, 9, 1);
        Set<Integer> setList = new HashSet<>();
        Set<Integer> valueOfRepeatList = new HashSet<>();


        for (int i = 0; i < list.size(); i++) {
            if (valueOfRepeatList.contains(list.get(i)))
                continue;
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    count++;
                }
            }
            if (count == 1) {
                setList.add(list.get(i));
            } else {
                String result = list.get(i).toString() + count;
                setList.add(Integer.valueOf(result));
                valueOfRepeatList.add(list.get(i));
            }
        }
        System.out.println(setList);
    }

    //Пересечение множест, сформировать пересечение множеств
    public void twoSet(Set<Integer> set1, Set<Integer> set2) {
        List<Integer> list = new ArrayList<>();
        set1.forEach(element1 -> {
            set2.forEach(element2 -> {
                if (element1.equals(element2)) {
                    list.add(element1);
                }
            });
        });
    }

    public boolean registerUser(String name) {
        Set<String> users = Set.of("Ivan", "Ilya", "Igor");
        for (String user : users) {
            if (user.equals(name))
                return true;
        }
        return false;
    }

    public void checkNameAndGenerate(String name) {
        Set<String> users = new HashSet<>();
        users.add("Ivan");
        if (!users.contains(name)) {
            users.add(name);
            System.out.println("ok");
        } else {
            Random random = new Random();
            String generateName = name;
            while (users.contains(generateName)) {
                StringBuilder builder = new StringBuilder();
                builder.append(name);
                builder.append(random.nextInt(11));
                generateName = builder.toString();
            }
            users.add(generateName);
            System.out.println("Извините ваше имя " + name + " занято, ваше новое имя " + generateName + ".");
        }
    }
}
