package arrays;

import java.util.Scanner;

public class ArrayDemo {
    //Input to Array
    public static void main(String[] args) {
        int []arr ={10, 20, 30, 40};
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();

        //Input array from user
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

    }

}
