package Assignment1;

import java.util.Scanner;

public class FindOddEvenTenNumber {
    public static void main(String[] args){
        int[] in = new int[10];
        int countOdd=0;
        int countEven=0;
        int sum=0;
        double average=0;

        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 10; i++) {
            in[i] = new Scanner(System.in).nextInt();
            if(in[i]%2==0){
                countOdd++;
            }
            else{
                countEven++;
            }
            sum=sum+in[i];
        }
        average = (double) sum/10;

        System.out.println("The number of odd number are: "+countOdd);
        System.out.println("The number of even number are: "+countEven);
        System.out.println("The Sum of numbers is: "+sum);
        System.out.println("The Average of numbers is :"+average);
    }
}
