package Assignment1;

import java.util.Scanner;

public class NumberPrimeOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a Number:");
        int flag = 0;
        int s = input.nextInt();
        for (int i = 2; i <= s/2; i++) {
            if (s % i == 0) {
                flag = 1;
                break;
            }
        }
        if (s == 1) {
            System.out.println("1 is neither prime nor composite.");
        }
        else {
            if (flag == 0)
                System.out.println(s+" is a prime number.");
            else
                System.out.println(s+" is not a prime number.");
        }
    }
}