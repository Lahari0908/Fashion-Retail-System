package service;

import model.Order;

public class PaymentService {
    public PaymentResult authorizePayment(String orderId) {
        System.out.println("Payment authorized for order: " + orderId);
        return new PaymentResult("AUTHORIZED");
    }

    public PaymentResult capturePayment(Order order) {
        System.out.println("Payment captured: $" + order.calculateTotal());
        return new PaymentResult("CAPTURED");
    }
}

class PaymentResult {
    private String status;
    public PaymentResult(String status) { this.status = status; }
    public String getStatus() { return status; }
}
