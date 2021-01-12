package Assignment2;

public class SortArray {
    public static void main(String[] args) {

        int [] intArray = {2,4,3,1,6,8,7};
        int temp = 0;

        System.out.println("Original array: ");
        for (int i = 0; i <intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }

        for (int i = 0; i <intArray.length; i++) {
            for (int j = i+1; j <intArray.length; j++) {
                if(intArray[i] >intArray[j]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Array sorted in ascending order: ");
        for (int i = 0; i <intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
