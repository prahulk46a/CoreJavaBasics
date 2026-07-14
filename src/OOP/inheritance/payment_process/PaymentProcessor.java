package OOP.inheritance.payment_process;

public abstract class PaymentProcessor {
    public void validatePayment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid payment amount.");
        }
        System.out.println("Payment validation successful.");
    }

    public abstract boolean processPayment(double amount);

    public abstract boolean refund(String transactionId);
}
