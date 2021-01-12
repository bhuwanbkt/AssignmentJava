import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float[] subject_mark = new float[5];
        float sum = 0;

        System.out.println("Enter marks in first subject");
        subject_mark[0] = s.nextFloat();
        sum += subject_mark[0];

        System.out.println("Enter marks in second subject");
        subject_mark[1] = s.nextFloat();
        sum += subject_mark[1];

        System.out.println("Enter marks in third subject");
        subject_mark[2] = s.nextFloat();
        sum += subject_mark[2];

        System.out.println("Enter marks in fourth subject");
        subject_mark[3] = s.nextFloat();
        sum += subject_mark[3];

        System.out.println("Enter marks in fifth subject");
        subject_mark[4] = s.nextFloat();
        sum += subject_mark[4];

        System.out.println(sum);

        float pr;
        pr = (sum/500)*100;

        if(pr<45) {
            System.out.println("Grade is F");
        }
        else if(pr<60){
            System.out.println("Grade is C");
        }
        else if(pr<70){
            System.out.println("Grade is B");
        }
        else{
            System.out.println("Grade is A");
        }
    }
}
