package lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DynamicArray {
    private List<Integer> list;

    public DynamicArray() {
        this.list = new ArrayList<>();
    }

    public DynamicArray(int size) {
        this.list = new ArrayList<>(size);
    }

    public void generateRandomArray(){
        Random random = new Random();
        for (int i = 0; i < list.size(); i++) {
            list.add(random.nextInt(100));
        }
    }

    public void  generateRandomArray(int size){
        Random random= new Random();
        for (int i = 0; i <= size; i++) {
            list.add(random.nextInt(100));

        }
    }
}
