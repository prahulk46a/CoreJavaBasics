package OOP.polymorphism;

public class PolymophismChild extends Polymorphism {
    //overriding
    @Override
    public void testPolymorphism() {
        System.out.println("This is for Child testing Polymorphism");
    }


    public static void main(String[] args) {
        Polymorphism p1 = new Polymorphism();
        Polymorphism p2 = new PolymophismChild();
        p1.testPolymorphism();
        p2.testPolymorphism();
    }
}
