package com.this_super.java;
class Parent1{
	 int a;
     int b;
	Parent1()
	{
		System.out.println("This Parent Class Default Constructor");
	}
	Parent1(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(this.a+" "+this.b);
	}
}
public class Example4 extends Parent1 
{
	String str;
	String str1;
	    Example4()
	   {
	    	super(10,20);
		System.out.println(" This Is Child Class default Constructor ");
	   }
	   Example4(String str,String str1)
	   {
		   this.str=str;
		   this.str1=str1;
         System.out.println("This is Child class parameterized Constructor ");
	   }
	public static void main(String[] args) {

   Example4 e=new Example4();
 
	}

}
