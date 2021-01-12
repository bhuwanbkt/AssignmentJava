package Assignment2;

import java.util.Scanner;

public class SearchArrayValue {
    public static void main(String[] args){
        int[] arr = {1,3,5,6,8,9};
        boolean flag= false;
        int index=0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();

        System.out.println("Enter a number:");
        int in = new Scanner(System.in).nextInt();

        System.out.print("Result: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==in){
                flag = true;
                index = i;
                break;
            }
        }
        if(flag){
            System.out.println(in+" is in "+ index+" index");
        }
        else {
            System.out.println(in+" Not found");
        }
    }
}
