package com.Static.java;

class Demo3{
	
	
	public void add() {
		//calling static method in instance method
		mul();
		int a=50;
		int b=35;
		int c;
		c=a+b;
		System.out.println("addition of two numbers : "+c);
		
	}
	
	static void mul() {
		int a=10;
		int b=3;
		int c;
		c=a*b;
		System.out.println("Multiplication of two numbers : "+c);
		
	}	
}
public class Prog4 {

	public static void main(String[] args) 
	{
    Demo3 d=new Demo3();
    d.add();

	}

}
