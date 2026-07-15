package miscellaneous.generics;

public class Main {
    public static void main(String[] args) {
        GenericsDemo<String> demo = new GenericsDemo<>();
        demo.setValue("Java");
        System.out.println(demo.getValue());
    }
}
