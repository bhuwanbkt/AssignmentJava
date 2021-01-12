package Assignment1;

import java.util.Scanner;

public class SumOfGiveNo {
    public static void main(String[] args){
        System.out.println("Enter a Numbers:");
        int no= new Scanner(System.in).nextInt();
        int sum = 0;
        while(true){
            if(no<10){
                sum = sum + no%10;
                break;
            }
            else{
                sum = sum + no%10;
                no = no/10;
            }
        }
        System.out.println("Sum of number is: "+ sum);
    }
}
