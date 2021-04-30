package com.Interface.java;
interface I{
	static int a=50;
	static int b=60;
	static void add() {
		int c=0;
		c=a+b;
		System.out.println(c);
	}
}
public class Interfce {

	public static void main(String[] args) {
		System.out.println(I.a);
		System.out.println(I.b);
		I.add();

	}

}
