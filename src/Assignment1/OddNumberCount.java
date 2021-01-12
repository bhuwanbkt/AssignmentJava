package Assignment1;

public class OddNumberCount {
    public static void main(String[] args){
        int count=0;
        System.out.println("The odd number from 1 to 99 are:");
        for (int i = 0; i < 100; i++) {
            if(i%2!=0){
                System.out.print(i+" ");
                count+=1;
            }
        }
        System.out.println();
        System.out.println("The number of odd number from 1 to 99 is: "+ count);
    }
}
