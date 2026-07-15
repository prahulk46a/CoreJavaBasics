package OOP.abstraction;

public class UserProcessor implements Processor<User> {

    @Override
    public void process(User data) {
        data.addUser();
    }
}
