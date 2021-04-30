package com.basics.java;
//Creating Class
class Demo{
	
	//Instance Variables
	
	int a=10;
	
	//Method
	public void method(int a,int b) {
		int c=a+b;
		System.out.println(c);
		
	}
}
public class Prog1 {

	public static void main(String[] args) {
	//Creating Object for Class Demo
		Demo d=new Demo();
		d.method(10,20);

	}

}
