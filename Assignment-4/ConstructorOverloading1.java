package com.java.basics;

class Student{
    String name;
    int age;

    Student(String name){
        this.name=name;
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class ConstructorOverloading1{
    public static void main(String[] args){
        Student s1=new Student("Kaviya");
        Student s2=new Student("Navya",22);

        s1.display();
        s2.display();
    }
}