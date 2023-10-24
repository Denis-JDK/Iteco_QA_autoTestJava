package lesson4;

public class Variable {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void printA(){
        System.out.println(a);
    }
    public void printB(){
        System.out.println(b);
    }
    public Integer sumVariable(){
        return a+b;
    }

    public int maxVariable(){

        return Math.max(a,b);
    }
}
