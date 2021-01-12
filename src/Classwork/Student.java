package Classwork;

public class Student{
    int id;
    String name;
    String address;

    public Student(int id,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void getStudent(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
    }
}