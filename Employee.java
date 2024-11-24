package SkiilsPw.OOPSJava;

public class Employee {
    public static void main(String[] args) {
        emp e1 = new emp("Mridul",18,123455); 
        e1.display();
        System.out.println();
        emp e2 = new emp("Mayur", 18, 123456);
        e2.display();      
    }
}
class emp{
    String name;
    int age;
    int contactNo;
    emp(String name,int age,int contactNo){
        this.name = name;
        this.age = age;
        this.contactNo = contactNo;
    }
    public void display(){
        System.out.print("Name of employee is " + name);
        System.out.println();
        System.out.print("Age of " + name + " is " + age);
        System.out.println();
        System.out.print("Contact number of " + name + " is " + contactNo);
    }
}
