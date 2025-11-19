package model;

public class Customer extends User {

    public Customer(String EMAILID, String PASSWORD) {
        super(EMAILID,PASSWORD);
    }

    public void placeOrder(Order ) {
        cart.add(Order);
        System.out.println("Ordered by " + getEmail());
}
