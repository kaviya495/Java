package com.java.basics;

class Employee3{
    String name;
    int id;

    Employee3(String name,int id){
        this.name=name;
        this.id=id;
    }
    void responsibility(){
        System.out.println("Employee performs assigned tasks");
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("ID:"+id);
    }
}
class Developer3 extends Employee3{
    Developer3(String name,int id){
        super(name,+id);
    }
    @Override
    void responsibility(){
        System.out.println("Developer writes and tests code");
    }
}

class Manager extends Employee3{
    Manager(String name,int id){
        super(name,id);
    }
    @Override
    void responsibility(){
        System.out.println("Manager manages the team");
    }
}

public class Main2{
    public static void main(String[] args){
        Developer3 d=new Developer3("Kaviya",101);
        Manager m=new Manager("navya",102);

        d.display();
        d.responsibility();

        m.display();
        m.responsibility();
    }
}