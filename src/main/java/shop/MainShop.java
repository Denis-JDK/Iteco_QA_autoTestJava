package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainShop {
//    Создаем мини приложение - интернет-магазин.  Должны быть реализованы следующие возможности:
//    Аутентификация пользователя. Пользователь вводит логин и пароль.
//    Просмотр списка каталогов товаров.
//    Просмотр списка товаров определенного каталога.
//    Выбор товара в корзину.
//    Покупка товаров, находящихся в корзине.
//    Создаем перечисление содержащее значения для перечисленных операций.
//    Можете добавить свои операции или изменить что-то на свой вкус.

    // //State       Catalog
    //User              Cart
    //Item
    //
    // //Actions
    //Item              Catalog
    //Buy from Cart         List of Items
    //Add to Cart
    // User -> See catalogs -> See items of the catalog -> Choose Items -> Add to Cart -> Buy from Cart
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String name = sc.nextLine();
    String pass = sc.nextLine();

    User user = new User(name,pass);
    User user1 = new User("Leo","user1");

    Repository repository = new Repository();
    repository.addUsers(user);
   // repository.addUsers(user1);

    Authentication authentication = new Authentication();

    authentication.authenticationUsers(user);

    Account account = new Account(
            new User("Yela","u31345"),
            new Cart(),
            new Wallet("5463321235", "5555",1000));

    Catalog catalog = new Catalog("dresses");
    catalog.addItem(new Item("dress 1", "Bosco", 100));
    catalog.addItem(new Item("dress 2", "Bosco 2", 200));

    Catalog catalogFood = new Catalog("food");
    catalogFood.addItem(new Item("food 1", "Cofe", 100));
    catalogFood.addItem(new Item("food 2", "Tie 2", 200));
    List<Catalog> catalogs = new ArrayList<>();
    catalogs.add(catalog);
    catalogs.add(catalogFood);

    Shop shop = new Shop(catalogs);
    Item newDress = shop.findCatalogByName("dresses").findItemByName("dress 2");
    account.getCart().addItem(newDress);

    account.bayItemsFromCart();

}


}
