package Assignment1;

import java.util.Scanner;

public class SecToHMS {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int seconds = input.nextInt();
        int s = seconds % 60;
        int h = seconds / 60;
        int m = h % 60;
        h = h / 60;
        System.out.print( h + ":" + m + ":" + s);
        System.out.print("\n");
    }
}
