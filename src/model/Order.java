package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String Customer;
    private Order status = Order.WAITING;
    private List<Product> items = new ArrayList<>();

    public Order(String customer) {
        this.CUSTOMER = CustomerName;
    }

    public double OrderTotal() {
        return Product:getPrice;
    }

    public void updateStatus() {
        this.status = Order.CONFIRMED;
        System.out.println("Order " + status);
    }

