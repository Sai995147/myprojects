package com.this_super.java;
class A{
	public void add() {
		int a=15;
		int b=10;
		int c;
		c=a+b;
		System.out.println(c);
	}
}
class B extends A{
	public void mul() {
		int a=20;
		int b=35;
		int c;
		c=a*b;
		System.out.println(c);
	}
	public void operations() {
		this.mul();
		super.add();
		
	}
}
public class Example5 {

	public static void main(String[] args) {
		B b=new B();
		b.operations();

	}

}
