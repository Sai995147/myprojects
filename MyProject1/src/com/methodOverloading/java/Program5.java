package com.methodOverloading.java;

public class Program5 {
	public String greet(String s1,String s2)
	{
	String s3=s1+" "+s2;
	return s3;
	}
	public int greet(int a,int b) {
		int c;
		c=a-b;
		return c;
	}
	public static void main(String[] args) {
		Program5 p=new Program5();
		System.out.println(p.greet("heloo hai", "welcome to the party"));
	
		System.out.println(p.greet(10, 5));

	}

}
