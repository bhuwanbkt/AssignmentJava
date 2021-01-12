package Assignment1;

import java.util.Scanner;

public class AreaOfHexagon {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Input the length of a side of the hexagon: ");
            double s = input.nextDouble();
            System.out.print("The area of the hexagon is: " + hexagonArea(s)+"\n");
        }
        public static double hexagonArea(double s) {
            return ((3*Math.sqrt(3)/2)*(Math.pow(s,2)));
        }
}
