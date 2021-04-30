package com.Static.java;

public class Prog5 {
	//instance variables
	int a=10;
	String b="hello";
	//static variables
  static boolean c=true;
  static byte d= 127;
	
	public static void main(String[] args) {

		Prog5 p=new Prog5();
		
		//printing instance variables
		
		System.out.println(p.a);
		System.out.println(p.b);
		
		//printing static variables
		
		System.out.println(Prog5.c);
		System.out.println(Prog5.d);
	}

}
