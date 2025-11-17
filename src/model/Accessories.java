package model;

public class Accessories extends Product {
    private String material;

    public Accessories(String productId, String name, double price, String material) {
        super(productId, name, price);
        this.material = material;
    }
}
