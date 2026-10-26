package com.java.basics;

class Product{
    int prodId;
    String prodName;
    double price;

    Product(){
        prodId=0;
        prodName="Unknown";
        price=0;
    }

    Product(int id,String name){
        prodId=id;
        prodName=name;
        price=0;
    }

    Product(int id,String name,double p){
        prodId=id;
        prodName=name;
        price=p;
    }

    void display() {
        System.out.println(prodId+" "+prodName+" "+price);
    }

    public static void main(String[] args){
        Product p1=new Product();
        Product p2=new Product(101,"Mouse");
        Product p3=new Product(102,"CPU",1500);

        p1.display();
        p2.display();
        p3.display();
    }
}