package Assignment1;

import java.util.Scanner;

public class Fibonaci {
        public static void main(String[] args) {

            System.out.print("Input a number: ");
            int n = new Scanner(System.in).nextInt();
            int t1 = 0, t2 = 1;
            System.out.print("First " + n + " terms: ");

            System.out.print(t1);
            for (int i = 1; i < n; ++i)
            {
                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
                System.out.print(", "+t1);
            }
        }
}
