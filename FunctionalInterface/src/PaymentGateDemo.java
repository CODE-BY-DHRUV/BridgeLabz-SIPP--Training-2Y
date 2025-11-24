interface PaymentProcessor {
    void processPayment(double amount);
    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " initiated (default implementation).");
    }
}

class Paytm implements PaymentProcessor {
    public void processPayment(double amount) { System.out.println("Paid ₹" + amount + " via Paytm."); }
}

public class PaymentGatewayDemo {
    public static void main(String[] args) {
        Paytm p = new Paytm();
        p.processPayment(1000);
        p.refund(200);
    }
}
