package typecasting.non_primitives_typecasting;

public class NonPrimitiveTypecasting {
    public static void main(String[] args) {
//      Animal animal = new Animal();//Normal object creation way
//      animal.sound(); // Animal makes sound...

//      Dog dog = new Dog();
//      dog.bark(); // Bhaw Bhaw

//      Upcasting
        Dog dog = new Dog();
        Animal animal = dog;    // Upcasting dog to animal implicit
        animal.sound();         // Animal makes sound...
//      animal.bark()         Will give error as no properties of dog class is accessible to animal class
        Animal animal2 = new Dog();   //Not all animals can bark so java allows only access methods of animal class
        animal2.sound();
//      animal2.bark()                //Same as above





/*      Down casting        */
        Animal animal3 = new Cat(); //
//      Dog dog2 = (Dog) animal3; // same as below
        Dog dog1= (Dog) new Animal();

        dog1.sound();
        dog1.bark();    //After downcasting, you can access subclass-specific methods and fields that aren't present in the superclass.



    }
}
