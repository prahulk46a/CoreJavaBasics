package OOP.inheritance.payment_process;

public class PaymentService {
    PaymentProcessor paymentProcessor;
    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }
    public void makePayment(double amount) {
        boolean success = paymentProcessor.processPayment(amount);
        if(success) {
            System.out.println("Payment Completed Successfully.");
        } else {
            System.out.println("Payment Failed.");
        }
    }

    public void refund(String transactionId) {
        paymentProcessor.refund(transactionId);
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new RazorpayProcessor();
        PaymentService service = new PaymentService(processor);
        service.makePayment(2500);
        service.refund("TXN12345");
    }
}
