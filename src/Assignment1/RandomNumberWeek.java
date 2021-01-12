package Assignment1;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberWeek {
    public static void main(String[] args){

        System.out.println("Enter a number");
        Scanner s = new Scanner(System.in);
        int in = s.nextInt();
        s.close();
        Random rn = new Random();
        for (int i = 0; i <in; i++) {
            int result = rn.nextInt(7)+1;
            switch(result)
            {
                case 1:
                    System.out.print(result+" = Sunday, ");
                    break;
                case 2:
                    System.out.print(result+" = Monday, ");
                    break;
                case 3:
                    System.out.print(result+" = Tuesday, ");
                    break;
                case 4:
                    System.out.print(result+" = Wednesday, ");
                    break;
                case 5:
                    System.out.print(result+" = Thursday, ");
                    break;
                case 6:
                    System.out.print(result+" = Friday, ");
                    break;
                case 7:
                    System.out.print(result+" = Saturday, ");
                    break;
            }
        }
    }
}
