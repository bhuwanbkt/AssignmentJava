import java.util.InputMismatchException;
import java.util.Scanner;

public class Age {
    public static void main(String[] args)
    {
        int age = 0;
        while(true) {
            System.out.println("Enter your Age ?");
            try {
                age = new Scanner(System.in).nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please input only Numeric value");
                continue;
            }
            System.out.println("Your age is "+age);
            break;
        }
    }
}
