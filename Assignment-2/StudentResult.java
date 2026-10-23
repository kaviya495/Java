package com.java.basics;

public class StudentResult{
    int Total(int a,int b,int c,int d,int e){
        return a+b+c+d+e;
    }
    double Average(int total){
        return total/5.0;
    }
    String Grade(double avg){
        if(avg>=90)
            return "A";
        else if(avg>=75)
            return "B";
        else if(avg>=50)
            return "C";
        else
            return "Fail";
    }

    public static void main(String[] args) {
        StudentResult s=new StudentResult();

        int total=s.Total(85,75,90,88,78);
        double avg=s.Average(total);
        String grade=s.Grade(avg);

        System.out.println("Total: "+total);
        System.out.println("Average: "+avg);
        System.out.println("Grade: "+grade);
    }
}