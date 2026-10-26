package com.java.basics;

class Employee2{
    int empId;
    String Name;
    double salary;

    Employee2(int id,String name,double sal){
        empId=id;
        Name=name;
        salary=sal;
    }
    double AnnualSalary(){
        return salary*12;
    }
    public static void main(String[] args){
        Employee2 e1=new Employee2(101,"Arun",25000);
        Employee2 e2=new Employee2(102,"Navya",35000);
        Employee2 e3=new Employee2(103,"Arthy",40000);

        System.out.println(e1.Name+":"+e1.AnnualSalary());
        System.out.println(e2.Name+":"+e2.AnnualSalary());
        System.out.println(e3.Name+":"+e3.AnnualSalary());
    }
}