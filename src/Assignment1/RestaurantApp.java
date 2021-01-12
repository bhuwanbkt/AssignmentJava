package Assignment1;

import java.util.Scanner;

public class RestaurantApp {
    public static void main(String[] args){
        System.out.println("How many items:");
        int itemNo = new Scanner(System.in).nextInt();
        double itemPrice;
        double TotalPrice = 0;
        for (int i = 0; i <itemNo ; i++) {
            itemPrice=0;
            System.out.println("Enter price for item "+(i+1) );
            itemPrice = new Scanner(System.in).nextDouble();
            TotalPrice = TotalPrice+itemPrice;
        }

        double tax = ((0.05)*TotalPrice);

        System.out.println("Your bill:");
        System.out.println("Price: "+TotalPrice);
        System.out.println("Tax: "+tax);
        System.out.println("Any tip? y/n");
        String tips =new Scanner(System.in).nextLine();
        double totalBill;
        if(tips.equals("y")){
            System.out.println("Enter tips");
            int tipAmt = new Scanner(System.in).nextInt();
            System.out.println("Tips:"+tipAmt);
            totalBill = TotalPrice+tax+tipAmt;
        }
        else{
            totalBill = TotalPrice+tax;
        }
        System.out.println("Your total bill is:"+totalBill);
    }
}
