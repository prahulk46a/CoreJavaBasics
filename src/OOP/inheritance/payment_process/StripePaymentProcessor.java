package OOP.inheritance.payment_process;

public class StripePaymentProcessor extends PaymentProcessor {
    @Override
    public boolean processPayment(double amount) {

        validatePayment(amount);

        System.out.println("Connecting to Stripe...");
        System.out.println("Creating Payment Intent...");
        System.out.println("Charging Customer ₹" + amount);
        return true;
    }

    @Override
    public boolean refund(String transactionId) {
        System.out.println("Stripe Refund Initiated...");
        System.out.println("Refund Successful : " + transactionId);

        return true;
    }
}
