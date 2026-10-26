package com.java.basics;

public class StudentRegistration {
String name;
int  rollno;

void register(String n,int r) {
	name=n;
	rollno=r;
}

void display() {
	System.out.println("Name: "+name);
	System.out.println("Rollno: "+rollno);
}

public static void main(String[] args) {
	StudentRegistration s1=new StudentRegistration();
	StudentRegistration s2=new StudentRegistration();
	StudentRegistration s3=new StudentRegistration();
	
	s1.register("Kaviya", 101);
	s2.register("Navya",102);
	s3.register("Sabareesh",103);
			
	s1.display();
	s2.display();
	s3.display();
}
}
