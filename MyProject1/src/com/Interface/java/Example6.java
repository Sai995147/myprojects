package com.Interface.java;
interface Parent{
	default void greet() 
	{
		System.out.println("Hi Hello This Is Interface Default Method");
	}
}
public class Example6 implements Parent{

	public static void main(String[] args) {
Example6 e=new Example6();
e.greet();
		

	}

}
