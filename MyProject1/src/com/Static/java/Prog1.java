package com.Static.java;

class Demo{
	//Declaring instance variables
	
	int a=10,b=20;
	
	//Declaring Static Variables
	
	static float c=50.3f;
	static double d=60.30;
	
	//creating instance method
	
	public void add() 
	{
		int c=this.a+this.b;
		System.out.println(c);
	}
	public static void mul() 
	{
		double s=c*d;
		System.out.println(s);
	}
	
	
	
}
public class Prog1 {

	public static void main(String[] args) {
		Demo d= new Demo();
		d.add();
		Demo.mul();

	}

}
