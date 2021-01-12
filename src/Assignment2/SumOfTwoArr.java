package Assignment2;

public class SumOfTwoArr {
    public static void main(String[] args){
        int[] arr1= {3,4,5,6};
        int[] arr2= {2,3,6,7};
        int[] sumArr = new int[arr1.length];

        System.out.println("First Array:");

        for (int a:
             arr1) {
            System.out.print(a+" ");
        }

        System.out.println("\nSecond Array:");

        for (int b:
             arr2) {
            System.out.print(b+" ");
        }

        System.out.println("\nSum of array:");
        for (int i = 0; i < arr1.length; i++) {
            sumArr[i]=arr1[i]+arr2[i];
            System.out.print(sumArr[i]+" ");
        }

    }
}
