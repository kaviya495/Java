package com.java.basics;

class Student{
    int studentId;
    String studentName,course;

    void Display(){
        System.out.println(studentId+" "+studentName+" "+course);
    }

    public static void main(String[] args){
        Student s=new Student();
        s.Display();
    }
}