package collections.examples.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequncyOfCharacter {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        Map<Character,Integer> mp=new HashMap<>();

        for(char ch:str.toCharArray()){
            if(ch!=' '){
                mp.put(ch,mp.getOrDefault(ch,0)+1);
            }
        }
        System.out.println(mp);
    }
}
