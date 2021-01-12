package Assignment1;

import java.util.ArrayList;

public class DivisibleByNumber {

        public static void main(String[] args){
            int count=0;
            ArrayList<Integer> divisibleFive = new ArrayList<Integer>();
            ArrayList<Integer> divisibleThree = new ArrayList<Integer>();
            ArrayList<Integer> divisibleFiveThree = new ArrayList<Integer>();

            System.out.println("The odd number from 1 to 99 are:");
            for (int i = 1; i < 100; i++) {
                if(i%3==0 && i%5==0){
                    divisibleFiveThree.add(i);
                }
                else if(i%5==0){
                    divisibleFive.add(i);
                }
                else if(i%3==0){
                    divisibleThree.add(i);
                }
            }

            System.out.println("Divisible by 3");
            divisibleThree.forEach((a)->System.out.print(a +", "));
            System.out.println();

            System.out.println("Divisible by 5");
            divisibleFive.forEach((a)->System.out.print(a +", "));
            System.out.println();

            System.out.println("Divisible by 3 and 5");
            divisibleFiveThree.forEach((a)->System.out.print(a +", "));
            System.out.println();
        }
}
