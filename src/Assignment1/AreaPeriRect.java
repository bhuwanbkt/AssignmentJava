package Assignment1;

import java.util.Scanner;

public class AreaPeriRect {
    public static void main(String[] args){

        System.out.println("Enter Length:");
        int l = new Scanner(System.in).nextInt();
        System.out.println("Enter Breath:");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Area is: "+(l*b));
        System.out.println("Perimeter is: "+(2*(l+b)));
    }
}
