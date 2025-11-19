package service;

import model.Order;

public class Payment{
    public Payment authorizePayment(String ORDERNO) {
        System.out.println("Payment authorisation for " + orderId);
        return new Payment("AUTHORISED");
    }

    public PaymentResult getPayment(Order order) {
        System.out.println("Payment Successful for: $" + order.Total());
        return new PaymentResult("SUCCESSFUL");
    }
}

class PaymentResult {
    private String status;
    public PaymentResult(String status) { this.status = status; }
}
