package Assignment2;

public class SumOfArr {
    public static void main(String[] args){
        int[] arr = {1,3,5,6,8,9};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }

        System.out.println("Sum of array: "+sum);
    }
}
