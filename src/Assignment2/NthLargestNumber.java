package Assignment2;

import java.util.HashSet;
import java.util.Scanner;

public class NthLargestNumber {
    public static void main(String args[]) {
        System.out.println("Enter a nth number to be searched");
        int n = new Scanner(System.in).nextInt();
        int[] arr = {5, 2, 6, 7, 10, 90, 57};
        int[] maxArr = new int[n];
        HashSet<Integer> hashArr = new HashSet<>();
        for (int v :
                arr) {
            System.out.print(v + " ");

        }
        System.out.println();
        for (int a:
             arr) {
            hashArr.add(a);
        }

        for (int i = 0; i < maxArr.length; i++) {
            maxArr[i] = MaxNumber(hashArr);
            hashArr.remove(maxArr[i]);
        }
        if(n==1) {
            System.out.println("The " + n + "st max is " + maxArr[maxArr.length - 1]);
        }else if(n==2){
            System.out.println("The " + n + "nd max is " + maxArr[maxArr.length - 1]);
        }else if(n==3){
            System.out.println("The " + n + "rd max is " + maxArr[maxArr.length - 1]);
        }else{
            System.out.println("The " + n + "th max is " + maxArr[maxArr.length - 1]);
        }

    }

    public static int MaxNumber(HashSet<Integer> hArr) {
        int max = Integer.MIN_VALUE;
        Object[] arr = hArr.toArray();

        for (int i = 0; i < arr.length; i++) {
            int a = (int)arr[i];
            if (a > max) {
                max = a;
            }
        }
        return max;
    }
}
