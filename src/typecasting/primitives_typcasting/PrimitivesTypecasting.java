package typecasting.primitives_typcasting;

public class PrimitivesTypecasting {
    public static void main(String[] args) {
        //implicit typecasting
        int number=10;
        double number2=number;
        System.out.println(number2);

        //Explicit typecasting
        double number3=20.05;
        int number4=(int) number3;
        System.out.println(number4);    //20 loss of 0.5
    }
}
