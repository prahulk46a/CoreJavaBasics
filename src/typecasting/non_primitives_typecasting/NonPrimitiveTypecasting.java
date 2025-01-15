package typecasting.non_primitives_typecasting;

public class NonPrimitiveTypecasting {
    public static void main(String[] args) {
//      Animal animal = new Animal();//Normal object creation way
//      animal.sound(); // Animal makes sound...

//      Dog dog = new Dog();
//      dog.bark(); // Bhaw Bhaw

//      Upcasting : Example1
        Dog dog = new Dog();                                        //CHILD (down)  to     parent(up)   (similar to byte to int)
        Animal animal = dog;    // Upcasting dog to animal implicit  dog class upcasted as animal class
        animal.sound();         // Animal makes sound...
//      animal.bark()         Will give error as no properties of dog class is accessible to animal class. reference is of animal class

        //I want to access dog class methods so need to downcast first
        //Down casting
        if(animal instanceof Dog){
            Dog dog2 = (Dog) animal;    //downcasting => After downcasting, you can access subclass-specific methods and fields that aren't present in the superclass.
            dog2.bark();    //bhaw bhaw
        }





        //Upcasting : Example2
        Animal animal2 = new Dog();   //Not all animals can bark so java allows only access methods of animal class. Every dog is an animal
        animal2.sound();
        animal2.eat();
//      animal2.bark()





        //Down casting => Cases where we get classCastException.
//        Animal animal3 = new Cat(); // animal3 is a reference of type Animal, but the object it points to is a Cat instance.
//        Dog dog2 = (Dog) animal3;   //Here, we are attempting to cast an object of type Cat to Dog, which is not valid because Cat and Dog are unrelated classes (even if both extend Animal).
//        Dog dog1 = (Dog) new Animal();  //You are attempting to cast an instance of Animal directly to Dog. This is also invalid because a generic Animal object is not inherently a Dog. Only objects explicitly created as Dog (e.g., new Dog()) can be cast to Dog.
//
//        dog1.sound();
//        dog1.bark();





    }
}
