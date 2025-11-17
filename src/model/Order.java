package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customer;
    private OrderStatus status = OrderStatus.PENDING;
    private List<Product> items = new ArrayList<>();

    public Order(String customer) {
        this.customer = customer;
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(Product::getPrice).sum();
    }

    public void updateStatus() {
        this.status = OrderStatus.CONFIRMED;
        System.out.println("Order status updated to " + status);
    }

    public void addProduct(Product p) {
        items.add(p);
    }

    public String getCustomer() { return customer; }
    public OrderStatus getStatus() { return status; }
    public List<Product> getItems() { return items; }
}
