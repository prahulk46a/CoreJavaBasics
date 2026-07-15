package OOP.abstraction;

public class OrderProcessor implements Processor<Order> {
    public void process(Order order) {
        order.placeOrder();
    }
}
