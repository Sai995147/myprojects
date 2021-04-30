package com.Accessmodifiers.java;

public class Demo1 {
 private int a=10;
private int b=30;

private void add() {
	int c;
	c=this.a+this.b;
	System.out.println(c);
}
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		//calling private members
		System.out.println(d.a);
		System.out.println(d.b);
		//calling private method from same class
		d.add();

	

	}
}
//creating Subclass
class A extends Demo1{
	/*
	 * we can't access private fields
	 * private methods from those class
	 * */

public static void main(String[] args) {
	A obj=new A();
	//obj.a;
	
	//obj.b;
	//obj.add();
	
}






}







