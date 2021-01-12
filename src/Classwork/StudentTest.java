package Classwork;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args){
        Student std1 = new Student(1,"Bhuwan","Dallas");
        Student std2 = new Student(2,"Laxman","Iriving");
        Student std3 = new Student(3,"Bhuwan","Elpaso");

        ArrayList<Student> std = new ArrayList<Student>();
        std.add(std1);
        std.add(std2);
        std.add(std3);

        System.out.println(std.toString());

    }
}
