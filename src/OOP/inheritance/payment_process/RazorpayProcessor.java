package OOP.inheritance.payment_process;

public class RazorpayProcessor extends PaymentProcessor {
    @Override
    public boolean processPayment(double amount) {

        validatePayment(amount);

        System.out.println("Connecting to Razorpay...");
        System.out.println("Generating Payment Order...");
        System.out.println("Processing payment of ₹" + amount);

        return true;
    }

    @Override
    public boolean refund(String transactionId) {

        System.out.println("Connecting to Razorpay Refund API...");
        System.out.println("Refund Successful for Transaction : " + transactionId);

        return true;
    }
}
