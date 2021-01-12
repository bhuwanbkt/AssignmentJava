package Assignment2;

import java.util.HashSet;

public class RemoveDuplicateInArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,4,4,9,5,5,10,10,12,11,11,11,11};
        HashSet<Integer> hashArr= new HashSet<Integer>();
        for (int i = 0; i <arr.length ; i++) {
                hashArr.add(arr[i]);
        }
        System.out.println("New Array is: "+hashArr);
    }
}
