package lesson5.practice.task3;

import java.util.List;

public class MakeClothes {

    public void dressMan(List<Clothes> list){
        for (Clothes clothes : list) {
            clothes.dressWomen();
            clothes.dressMan();

        }
    }
}
