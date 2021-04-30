package com.constructors.java;
class Demo1
{
	int a;
	int b;
	String str;
	Demo1(){
		System.out.println("This is Default Constructor");
		System.out.println(a);
		System.out.println(b);
		System.out.println(str);
		}
	public Demo1(int a) 
	{
		this.a=a;
		System.out.println("This is One Argument Constructor :"+this.a);
	 }
	public Demo1(int b,String str)
	{
		this.b=b;
		this.str=str;
		System.out.println("This is Two Argument Constructor :"+this.b+" "+this.str);
	}
}
public class Example1 {

	public static void main(String[] args) {
		
	Demo1 d=new Demo1();
	Demo1 d1=new Demo1(101);
	Demo1 d2=new Demo1(102,"Saikumar");

	}

}
