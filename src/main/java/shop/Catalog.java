package shop;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private String name;
    private List<Item> items;

    public Catalog(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public List<Item> getItems(){ //показываем список товаров клиенту
        return items;
    }
    public Item findItemByName(String name){
//        for (Catalog catalog : catalogs) {
//            if(catalog.getName().equals(name))
//                return catalog;
//        }
//        return null;
        return items.stream().filter(it ->it.getName().equals(name)).findFirst().get();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        items.remove(item);
        //важно переопределить eguals hashcod для Item.class, чтоб можно было найти и удалить item.
    }

    public String getName() {
        return name;
    }
}
