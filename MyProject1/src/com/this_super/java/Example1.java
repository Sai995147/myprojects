package com.this_super.java;
class Parent
{
	int a;
	float b;
	Parent(int a,float b){
		this.a=a;
		this.b=b;
	}
}
public class Example1 extends Parent {

	Example1() {
		super(10, 20);
	System.out.println(super.a+" "+super.b);
	}

	public static void main(String[] args) {
		
		Example1 e=new Example1();
	}

}
