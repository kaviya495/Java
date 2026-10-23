package com.java.basics;

public class ElectricityBill1{

    double calculateBill(int units){
        if (units<=100)
            return units*2;
        else if (units<=200)
            return 200+(units-100)*3;
        else
            return 500+(units-200)*5;
    }

    double addFixedCharge(double bill){
        return bill+50;
    }

    public static void main(String[] args){
        ElectricityBill1 e=new ElectricityBill1();

        double energy=e.calculateBill(250);
        double total=e.addFixedCharge(energy);

        System.out.println("Energy Charge: " +energy);
        System.out.println("Fixed Charge:50.0");
        System.out.println("Final Bill: " +total);
    }
}