package Assignment1;

import java.util.Scanner;

public class InputLeftStarPiramid {
    public static void main(String[] args){
        System.out.println("Enter a number:");
        int in = new Scanner(System.in).nextInt();
        for (int i = 0; i < in; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
