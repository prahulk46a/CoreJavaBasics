package strings;

public class StringDemo {
    public static void main(String[] args) {
        //Ways to create string
        String str1 = "Hello World"; //String literal way  This will get created into string pool
        String str2 = new String("Hello World"); //using new keyword

//        str2="Rahul";  this will store Rahul into string pool
//        System.out.println(str1 == str2);

        System.out.println(str1 == str2); //false even if value same but they both have diff memory of storage


        //String methods
        System.out.println(str1.equals(str2));//true will check if value only equal

        System.out.println(str1.length()); //11
        System.out.println(str1.charAt(0)); //H
        System.out.println(str1.substring(0, 5)); // Hello => exclusive end index
        System.out.println(str1.toUpperCase() );  // HELLO WORLD returns new string with all uppercases. will not modify original one
        System.out.println(str1.toLowerCase());   // hello world

        String str3 = "Hello World";
        System.out.println(str3.trim());    // Hello world, removes all white spaces from start and end
        System.out.println(str3.contains("Hello"));
        System.out.println(str3.indexOf("l"));//2  returns start index of substring

        System.out.println(str3.lastIndexOf("ll"));//2 last time when occurs that start index of substring is returned
        str3=str3.replace("ello","i");//Do not modify you have to reassign value
        System.out.println(str3);

        int num = 42;
        String numStr = String.valueOf(num);
        System.out.println(numStr); // Output: "42"

    }
}
