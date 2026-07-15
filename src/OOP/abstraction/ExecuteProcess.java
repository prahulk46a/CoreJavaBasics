package OOP.abstraction;

public class ExecuteProcess {
    public static void main(String[] args) {
        Processor<Payment> paymentProcessor = new PaymentProcessor();
        paymentProcessor.process(new Payment());

        Processor<Order> paymentProcessor2 = new OrderProcessor();
        paymentProcessor2.process(new Order());

    }
}
