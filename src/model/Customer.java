package model;

public class Customer extends User {

    public Customer(String EMAILID, String PASSWORD) {
        super(EMAILID,PASSWORD);
    }

    public void placeOrder(Order ) {
        basket.add(order);
        System.out.println("Ordered by " + getEmail());
}
