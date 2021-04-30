package com.constructors.java;
class A
{
	int a,b;
	public A(){
		
		System.out.println("Parent class Default Construtor");
		System.out.println(a);
		System.out.println(b);
	}
	public A(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Parent class Parameterized Constructor");
		System.out.println(a);
		System.out.println(b);
	}
}
class B extends A
{
	String str;
	public B()
	{
		super();
	}
	public B(String str)
	{
		super(10,20);
		this.str=str;
		System.out.println("Child class Constructor");
		System.out.println(str);
	}
	
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
B b=new B("Saikumar");
	}

}
