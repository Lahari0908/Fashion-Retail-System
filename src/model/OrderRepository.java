package repository;

import model.Order;
import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    private List<Order> orders = new ArrayList<>();

    public List<Order> findByCustomerId(String customerId) {
        return orders.stream()
                     .filter(o -> o.getCustomer().equals(customerId))
                     .toList();
    }

    public void save(Order order) {
        orders.add(order);
    }
}
