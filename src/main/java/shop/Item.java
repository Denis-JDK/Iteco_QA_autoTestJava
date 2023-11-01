package shop;

import java.util.Objects;

public class Item {
    private String name;
    private String producer;
    private int price;

    public Item(String name, String producer, int price) {
        this.name = name;
        this.producer = producer;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getProducer() {
        return producer;
    }

    public int getPrice() {
        return price;
    }

    //переопределенны методвы сравнения, для корректной работы удаления item Catalog.class public void removeItem(Item item){
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return price == item.price && Objects.equals(name, item.name) && Objects.equals(producer, item.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, producer, price);
    }
}
