package com.java.basics;

class StudentRecord{
    int rollNo;
    String Name;
    int marks;

    StudentRecord(int roll,String name,int m){
        rollNo=roll;
        Name=name;
        marks=m;
    }

    StudentRecord(StudentRecord s){
        rollNo=s.rollNo;
        Name=s.Name;
        marks=s.marks;
    }

    void display(){
        System.out.println(rollNo+" "+Name+" "+marks);
    }

    public static void main(String[] args) {
        StudentRecord s1=new StudentRecord(1,"Karthik",80);
        StudentRecord s2=new StudentRecord(s1);

        s2.marks=90;

        s1.display();
        s2.display();
    }
}