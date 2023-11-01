package shop.products;

public abstract class Product {
    private String id;
    private Integer coast;
    private String name;
    private boolean inCart = false;

    public Product getProduct(){
        return this;
    }


}
