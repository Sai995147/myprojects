package com.methodOverloading.java;

public class Program4 {
public void greet(String s1,String s2)
{
	System.out.println(s1+" "+s2);
}
public void greet(int a,int b)
{
	System.out.println("multiplication of two numbers is :"+a*b);
}
	public static void main(String[] args) {

Program4 p=new Program4();
p.greet("Hi Saikumar","Please Welcome");
p.greet(10, 20);
	}

}
