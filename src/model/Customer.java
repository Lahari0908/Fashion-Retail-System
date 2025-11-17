package model;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private List<Order> cart = new ArrayList<>();

    public Customer(String email, String password) {
        super(email, password);
    }

    public void placeOrder(Order order) {
        cart.add(order);
        System.out.println("Order placed by " + getEmail());
    }

    public List<Order> getCart() { return cart; }
}
