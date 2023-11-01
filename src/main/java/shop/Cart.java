package shop;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item>items;

    public Cart() {
        this.items = new ArrayList<>();
    }
    public void addItem(Item item){
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void removeItem(Item item){
        items.remove(item);
        //важно переопределить eguals hashcod для Item.class, чтоб можно было найти и удалить item.
    }
}
