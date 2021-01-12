import java.util.InputMismatchException;
import java.util.Scanner;

public class Luck7 {
    public static void main(String[] args)
    {
        int no = 0;
        System.out.println("Please input a number? [1-10]");
        while(true) {
            try {
                no = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Not valid, Please input a number? [1-10]");
                continue;
            }
            if(no == 7)
                System.out.println("Congrats Lucky");
            else
                System.out.println("Not Lucky");
            break;
        }
    }
}
