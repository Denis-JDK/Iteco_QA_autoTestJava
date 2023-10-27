package lesson5.practice.task3;

import java.util.List;
import java.util.Objects;

public class MakeClothes {

    public void dressMan(List<Clothes> list){
        for (Clothes clothes : list) {
            clothes.dressWomen();
            clothes.dressMan();

        }
    }
    public void dressMan(List<WomenClothes> listW, List<ManClothes> listM ){
        for (WomenClothes clothes : listW) {
            clothes.dressWomen();
        }
        for (ManClothes clothes : listM) {
            clothes.dressMan();
        }
    }

}
