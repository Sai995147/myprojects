package com.Static.java;

public class Prog7 {
	
	public String print(String str) {
		
		return str;
	}
	
	static void divide() {
		int a=10;
		int b=3;
		int c;
		c=a/b;
		System.out.println(c);
		
	}	

	public static void main(String[] args) {
	//calling instance Method by creating OBJECT
     Prog7 p=new Prog7();

     System.out.println(p.print("Saikumar"));
     
	//calling static METHOD without using Object Reference
	
     Prog7.divide();
	}

}
