package miscellaneous.generics.example2;

public class EventPublisher <T>{

    public void publish(T event) {
        // Send to Kafka
        System.out.println("Publishing event " + event);
    }
}
