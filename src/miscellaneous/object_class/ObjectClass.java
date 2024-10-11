package miscellaneous.object_class;

public class ObjectClass implements Cloneable {
    String model;
    int year;

    public ObjectClass(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Overriding toString to provide a meaningful output
    @Override
    public String toString() {
        return "Car Model: " + model + ", Year: " + year;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
