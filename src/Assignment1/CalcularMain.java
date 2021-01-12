package Assignment1;

import java.util.Scanner;

public class CalcularMain {
    public static void main(String[] args){
        String Status="T";

        while(Status.equals("T")){
            System.out.println("Choose option below:");

            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. Mul");
            System.out.println("4. Div");
            System.out.println("5. Quit");
            int opt = new Scanner(System.in).nextInt();
            if(opt>5) {
                System.out.println("Invalid Option");
            }
            else if(opt==5){
                Status="F";
            }
            else {
                System.out.println("Enter Two Number:");
                int a = new Scanner(System.in).nextInt();
                int b = new Scanner(System.in).nextInt();
                Calculator s = new Calculator();
                if(opt==1){
                    System.out.println("Sum is: "+s.sum(a,b));
                }
                else if(opt==2){
                    System.out.println("Subtraction is: "+s.sub(a,b));
                }
                else if(opt==3){
                    System.out.println("Multiplication is: "+s.mul(a,b));
                }
                else if(opt==4){
                    System.out.println("Division is: "+s.div(a,b));
                }
            }
        }
    }
}
