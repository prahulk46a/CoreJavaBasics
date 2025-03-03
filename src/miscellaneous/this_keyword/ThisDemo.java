package miscellaneous.this_keyword;

public class ThisDemo {
    //Overriding Default constructor
    int a;
    ThisDemo(){
        System.out.println("This is a Constructor used for initialization");
    }

    // Here in bracket also int 'a' is declared and in global also 'a' is declared,
    // If we don't specify this then modifying 'a' will modify a which is inside bracket and instance variable 'a' will remain null
    // so to differentiate instance and local variable this keyword is useful. (UseCase 3)

    ThisDemo(int a){  //(UseCase2)
        this.a=a; // This represents current reference of an object (useCase1) (UseCase4)
        System.out.println("Value that passed inside constructor parameter is: "+a);
    }
}
