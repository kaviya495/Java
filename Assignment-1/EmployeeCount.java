package com.java.basics;

public class EmployeeCount{
    static int count=0;
    String name;

    void register(String n) {
        name=n;
        count++;
    }

    void display() {
        System.out.println("Name: "+name);
    }

    public static void main(String[] args) {
        EmployeeCount e1=new EmployeeCount();
        EmployeeCount e2=new EmployeeCount();
        EmployeeCount e3=new EmployeeCount();

        e1.register("Navya");
        e2.register("Saritha");
        e3.register("Kaviya");

        e1.display();
        e2.display();
        e3.display();

        System.out.println("Total Employees: "+count);
    }
}