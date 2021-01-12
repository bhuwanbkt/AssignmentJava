package Assignment2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

public class FindCommonInArray {
    public static void main(String[] args){
        int[] arr1 = new int[]{1,3,6,9,10,8};
        int[] arr2 = new int[]{1,2,4,7,8};
        ArrayList<Integer> common = new ArrayList<Integer>();
        HashSet<Integer> hashS= new HashSet<Integer>();

        if(arr1.length<=arr2.length){
            for(int a: arr1){
                hashS.add(a);
            }
        }
        else{
            for (int a:
                 arr2) {
                hashS.add(a);
            }
        }
        if(arr1.length<=arr2.length){
            for (int i = 0; i < arr2.length; i++) {
                if(hashS.contains(arr2[i])){
                    common.add(arr2[i]);
                }

            }
        }
        else{
            for (int i = 0; i < arr1.length; i++) {
                if(hashS.contains(arr1[i])){
                    common.add(arr1[i]);
                }
            }
        }
        System.out.println("Common values are: "+common);
    }
}
