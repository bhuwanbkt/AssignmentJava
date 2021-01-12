package Assignment2;

import java.util.HashSet;

public class DuplicateNoInArray {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,4,4,9,5,5,10,10,12,11,11,11,11};
        HashSet<Integer> hashArr= new HashSet<Integer>();
        HashSet<Integer> dupSet = new HashSet<Integer>();
        for (int i = 0; i <arr.length ; i++) {
            if(!hashArr.contains(arr[i])){
                hashArr.add(arr[i]);
            }
            else{
                dupSet.add(arr[i]);
            }
        }
        System.out.println("The duplicate values are : "+dupSet);
    }
}
