package shop;

public class Wallet {
    private String cardNumber;
    private String pinCode;
    private int currentMoney;

    public Wallet(String cardNumber, String pinCode, int currentMoney) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.currentMoney = currentMoney;
    }

    public boolean bye(int coast){
        boolean successOperation;
        if (currentMoney>=coast){
            currentMoney-=coast;
            successOperation = true;
        }else {
            successOperation = false;
        }
        return successOperation;

    }

    public int getCurrentMoney() {
        return currentMoney;
    }
}
