package Assignment1;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        System.out.println("Enter a number ?");
        int n = new Scanner(System.in).nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            for (int k = n-i; k > 1 ; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
