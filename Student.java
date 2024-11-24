package SkiilsPw.OOPSJava;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of student : ");
        String name = sc.nextLine();
        System.out.print("Enter the roll number of student : ");
        int rolNo = sc.nextInt();
        InnerStudent ins1 = new InnerStudent(rolNo,name);
        ins1.display();
    }
}
class InnerStudent {
    int rolNo;
    String name;
    InnerStudent(int rolNo,String name){
        this.name = name;
        this.rolNo = rolNo;
    }
    public void display(){
        System.out.print("Name of Student is : " + name);
        System.out.println();
        System.out.print("The roll number of " + name + " is : " + rolNo);
    }
}
