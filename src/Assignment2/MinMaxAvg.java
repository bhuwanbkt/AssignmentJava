package Assignment2;

public class MinMaxAvg {
    public static void main(String args[])
    {
        int[] arr = {5,2,6,7,10, 90,57};
        for (int v:
             arr) {
            System.out.print(v+" ");

        }
        System.out.println();
        int sum= 0,min = Integer.MAX_VALUE ,max=Integer.MIN_VALUE,avg=0;
        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        avg = sum/arr.length;
        System.out.println("Max is: "+ max);
        System.out.println("Min is: " + min);
        System.out.println("Avg is: "+avg);
        }
    }

