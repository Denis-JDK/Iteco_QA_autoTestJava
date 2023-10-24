package lesson4;

public class Counter {
    private static final int DEFAULT_VALUE=10;
    private int currentValue;

    public Counter(){
        this.currentValue=DEFAULT_VALUE;
    }

    public Counter(int currentValue) {
        this.currentValue = currentValue;
    }

    public void increaseValue(){
        currentValue++;
    }
    public void decreaseValue(){
        currentValue--;
    }

    public int getCurrentValue() {
        return currentValue;
    }
}
