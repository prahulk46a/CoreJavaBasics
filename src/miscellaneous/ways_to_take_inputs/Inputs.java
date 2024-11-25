package miscellaneous.ways_to_take_inputs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Inputs {
//    Scanner input = new Scanner(System.in);
//    int num=input.nextInt();//user input num
//    String str=input.next();
//    String str1=input.nextLine();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String name;
        try {
            System.out.println("Enter your name");
            name = reader.readLine(); // taking string input
            System.out.println("Name=" + name);
        }
        catch (Exception e) {
        }
    }



}
