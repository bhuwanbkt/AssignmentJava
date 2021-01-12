package Assignment2;

public class ReverseArray {
    public static void main(String[] args){

        int[] arr = {1,3,5,6,8,9};
        int[] revArr= new int[arr.length];
        System.out.println("The given array:");
        for (int i:
             arr) {
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.println("The Reverse of array is:");
        for (int i = 0,j= arr.length-1; i < arr.length; i++,j--) {
            revArr[i]=arr[j];
            System.out.print(revArr[i]+", ");
        }
    }
}
