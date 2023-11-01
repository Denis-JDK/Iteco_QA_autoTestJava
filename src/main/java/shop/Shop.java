package shop;

import java.util.List;

public class Shop {
    private List<Catalog> catalogs;

    public Shop(List<Catalog> catalogs) {
        this.catalogs = catalogs;
    }

    public Catalog findCatalogByName(String name){
//        for (Catalog catalog : catalogs) {
//            if(catalog.getName().equals(name))
//                return catalog;
//        }
//        return null;
        return catalogs.stream().filter(it ->it.getName().equals(name)).findFirst().get();
    }
}
