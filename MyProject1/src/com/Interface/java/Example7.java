package com.Interface.java;
interface B1{
	int a=50;
	int b=10;
	default void add() {
		int c;
		c=a+b;
		System.out.println(c);
	}
}
interface C1 extends B1
{
	
}
interface D1 extends B1{
	
}
public class Example7 implements D1 {

	public static void main(String[] args) {
Example7 e=new Example7();
e.add();
	}

}
