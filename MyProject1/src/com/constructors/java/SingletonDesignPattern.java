package com.constructors.java;
class Demo
{
	private static Demo d=null;
	private Demo() {
		
	}
	public static Demo object() {
		if(d==null) 
		{
		 d=new Demo();
		}
	
		return d;
	}
}

public class SingletonDesignPattern {

	public static void main(String[] args) {
		
//Demo d=new Demo();
		System.out.println(Demo.object());
		System.out.println(Demo.object());
	}

}
