package lesson4.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class User {
//    Создать класс покупатель с полями: фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//
//    Создать список из 5 покупателей (в main).
//    Вывести:
//
//    Имя покупателя с самой длинной фамилией
//    Адреса всех покупателей, у кого первая цифра номера кредитки 5.
//    Всех покупателей с отчеством "Евгеньевич"

    private String surname;
    private String name;
    private String rrename;
    private String place;
    private String numberCart;
    private Integer numberBank;

    public User(String surname, String name, String rrename, String place, String numberCart, Integer numberBank) {
        this.surname = surname;
        this.name = name;
        this.rrename = rrename;
        this.place = place;
        this.numberCart = numberCart;
        this.numberBank = numberBank;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getRrename() {
        return rrename;
    }

    public String getPlace() {
        return place;
    }

    public String getNumberCart() {
        return numberCart;
    }

    public Integer getNumberBank() {
        return numberBank;
    }

    public static String longSurname(List<User>list){
        String max = list.get(0).getName();
        for (int i = 0; i < list.size(); i++) {
            if (max.length()<list.get(i).getName().length()){
                max=list.get(i).getSurname();
            }
        }
        return max;

    }


    public static void main(String[] args) {
        User user = new User("Норма","Кеке", "Отчество","Place1", "566783456789234", 67464583);
        User user1 = new User("Норма13er","Кеке4", "Отчество4","Place2", "986863456789234", 46432583);
        User user2 = new User("Норма2","Кеке3455", "Отчество5","Place3", "54323456789234", 346432583);
        User user3 = new User("Норма3","Кеке74", "Отчество6","Place4", "983456789234", 546432583);
        User user4 = new User("Норма4","Кеке6768", "Отчество7","Place5", "7783456789234", 946432583);

       List<User> list = Arrays.asList(user1,user2,user4,user3,user);



       String name = longSurname(list);
        System.out.println(name);



    }

}
