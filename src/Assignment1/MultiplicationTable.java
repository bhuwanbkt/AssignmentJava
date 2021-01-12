package Assignment1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        System.out.print("Enter a multiplier : ");
        int multiplier= new Scanner(System.in).nextInt();

        System.out.print("Enter a nth multiplicand  : ");
        int multiplicand= new Scanner(System.in).nextInt();

        System.out.println("The multiplication table of " + multiplier +" upto "+ multiplicand+" :");

        for (int i = 1; i <= multiplicand; i++) {
            System.out.println(multiplier+" * "+i+" = "+(multiplier*i));

        }
    }
}
