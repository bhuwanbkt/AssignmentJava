package Classwork;

public class MiddleValueNew {
    public static void main(String[] args){
        int[] num = new int[]{1,2,3,4,5,6,7,8};
        int len = num.length;
        int middle_index = len/2;

        if(len%2==1){
           int mid1= num[middle_index];
           System.out.println("The middle value is "+mid1);
        }
        else{
            int mid1 = num[middle_index-1];
            int mid2 = num[middle_index];
            System.out.println("The middle value are "+mid1 +" and "+mid2 );
        }

    }
}
