import java.util.Scanner;

public class Shapes {
    public static void main(String[] args){
        String[] shape = {"!","@","#","$"};
        System.out.println("Enter a number ?");
        int n = new Scanner(System.in).nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                    System.out.print(shape[i%4]+" ");
            }
            System.out.println();
        }
    }
}
