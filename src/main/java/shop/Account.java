package shop;

public class Account {
    private User user;
    private Cart cart;
    private Wallet wallet;

    public Account(User user, Cart cart, Wallet wallet) {
        this.user = user;
        this.cart = cart;
        this.wallet = wallet;
    }

    public User getUser() {
        return user;
    }

    public Cart getCart() {
        return cart;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public boolean bayItemsFromCart(){
      int sum = cart.getItems().stream().mapToInt(Item::getPrice).sum();// перебераем item и сумируем price каждого
       return wallet.bye(sum);     //общую стоимость отправляем в кошелек для сравнения с имеющимися деньгами у User.
    }
}
