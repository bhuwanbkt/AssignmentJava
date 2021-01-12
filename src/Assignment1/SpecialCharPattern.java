package Assignment1;

import java.util.Scanner;

public class SpecialCharPattern {
    public static void main(String[] args){
        String[] shape = {"*","#","^"};
        System.out.println("Enter a number ?");
        int n = new Scanner(System.in).nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(shape[i%3]+" ");
            }
            System.out.println();
        }
    }
}
