package Assignment2;

public class PrintArrayValues {
    public static void main(String[] args){

        int[] arr = {1,3,5,6,8,9};
        System.out.println("The value in array are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    }
}
