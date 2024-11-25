package miscellaneous.unicodeSystem;

public class AsciiOperations {
    public static void main(String[] args) {

        System.out.println("Way One of conversion");
        Character charToAscii=(char)65;     //A
        System.out.println(charToAscii);
        int codePoint = "A".codePointAt(0);
        System.out.println(codePoint);      //65

        //Important for hashing
        System.out.println("Another way of conversion");
        char digit = '7';
        int numericValue = digit - '0'; // Converts '7' to integer 7
        System.out.println(numericValue); // Output: 7



    }

}
