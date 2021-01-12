package Assignment2;

public class ArrayEquals {
    public static void main(String[] args){
        int[] arr1={0,2,3,4};
        int[] arr2={1,2,3,4};

        System.out.println("First Array:");

        for (int a:
             arr1) {
            System.out.print(a+" " );
        }
        System.out.println("\nSecond Array:");
        for (int a:
                arr2) {
            System.out.print(a+" " );
        }
        System.out.println();

        Boolean flag=false;
        if(arr1.length== arr2.length) {
            for (int i = 0; i < arr1.length; i++){
                if (arr1[i] == arr2[i]) {
                    flag = true;
                }
                else{
                    break;
                }
        }
        }
        if(flag){
            System.out.println("Both are equal");
        }
        else {
            System.out.println("Both are not equal");
        }
    }
}
