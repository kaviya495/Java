package com.java.basics;

public class EmployeeSalary{

    double calculateSalary(double basic,double allowance){
        return basic+allowance;
    }
    double calculateNetSalary(double gross,double deductions){
        return gross-deductions;
    }
    void display(String name,double gross,double net){
        System.out.println("Name: "+name);
        System.out.println("Gross Salary: "+gross);
        System.out.println("Net Salary: "+net);
    }

    public static void main(String[] args){
        EmployeeSalary e=new EmployeeSalary();

        double gross=e.calculateSalary(25000,5000);
        double net=e.calculateNetSalary(gross,2000);

        e.display("Kaviya",gross,net);
    }
}