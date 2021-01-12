package Assignment1;

import java.util.Scanner;

public class EqualNumber {
    public static void main(String[] args) {
        System.out.println("Enter four numbers:");
        int[] no = new int[4];
        for (int i = 0; i < 4; i++) {
            no[i] = new Scanner(System.in).nextInt();
        }
        if (no[0] == no[1] && no[1] == no[2] && no[2] == no[3]) {
                    System.out.println("Equal");
                }
        else{
            System.out.println("Not equal");
        }
    }
}