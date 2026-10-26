package com.java.basics;

class BankAccount2{
    int accountNumber;
    String Name;
    double balance;

    BankAccount2(){
        accountNumber=1001;
        Name="Kaviya";
        balance=5000.0;
    }

    void display(){
        System.out.println(accountNumber+" "+Name+" "+balance);
    }

    public static void main(String[] args){
        BankAccount2 b1=new BankAccount2();
        BankAccount2 b2=new BankAccount2();

        b1.display();
        b2.display();
    }
}