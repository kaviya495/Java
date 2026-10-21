package com.java.basics;

abstract class AnimalAbs
{
	AnimalAbs()//default constructor
	{
		System.out.println("Just a constructor in animal class");
	}
	abstract void sound();//abstract method
	void Sleep()//non-abstract method or concrete method
	{
		System.out.println("SLEEP");
	}
}
public class AbstractExample extends AnimalAbs{
	AbstractExample(){
		System.out.println("Just a constructor in AbstractExample");
	}
	void sound()
	{
		System.out.println("Dog bark");
	}

	public static void main(String[] args) {
		AnimalAbs obj=new AbstractExample();//using constructor
		obj.Sleep();
	}

}
