package com.this_super.java;

public class Example2 {
float c;
float d;
Example2()
{
	System.out.println("Current class Default Constructor called");
}
Example2(float c,float d){
	this();
	this.c=c;
	this.d=d;
	System.out.println(this.c+" "+this.d);
}
	public static void main(String[] args) {
		Example2 e=new Example2(10,20);
	

	}

}
