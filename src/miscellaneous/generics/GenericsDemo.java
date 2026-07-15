package miscellaneous.generics;

// Generic class
public class GenericsDemo<T> {
    T value;
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }

}
