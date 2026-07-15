package OOP.abstraction;

public class PaymentProcessor implements Processor<Payment>{
    @Override
    public void process(Payment payment) {
        payment.execute();
    }

}
