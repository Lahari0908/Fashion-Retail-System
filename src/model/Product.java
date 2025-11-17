package model;

public abstract class Product {
    protected String productId;
    protected String name;
    protected double price;
    protected boolean inStock = true;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public boolean decrementStock() {
        if (inStock) {
            inStock = false;
            return true;
        }
        return false;
    }

    public void incrementStock() {
        inStock = true;
    }

    // Getters
    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public boolean isInStock() { return inStock; }
}
