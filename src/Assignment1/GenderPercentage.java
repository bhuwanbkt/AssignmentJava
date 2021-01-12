package Assignment1;

import java.util.Scanner;

public class GenderPercentage {
    public static void main(String[] args){
        System.out.println("Enter number of total students:");
        int totalStudents = new Scanner(System.in).nextInt();
        System.out.println("Enter number of total male student:");
        int maleStudents = new Scanner(System.in).nextInt();

        int femaleStudents = totalStudents-maleStudents;
        double malePercentage = (double)maleStudents/totalStudents*100;
        double femalePercentage = (double)femaleStudents/totalStudents*100;

        System.out.println("The percentage of male is "+malePercentage+ " and "+"percentage of female is "+femalePercentage);
    }
}
