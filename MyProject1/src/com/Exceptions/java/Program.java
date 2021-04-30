package com.Exceptions.java;

import java.util.Scanner;

class Demo{
	Scanner s=new Scanner(System.in);
	public void div() {
		System.out.println("Connection is established");
        System.out.println("Enter the Numerator");
		int a=s.nextInt();
		System.out.println("Enter the Denominator");
		int b=s.nextInt();
		int c;
		c=a/b;
		System.out.println(c);
		
	}
	public void array() {
		int arr[]=new int[5];
		for(int i=0;i<=5;i++) {
			System.out.println("Enter the Array Elements");
	   arr[i]=s.nextInt();
		}
	}
}
public class Program {

	public static void main(String[] args) {

Demo d=new Demo();
d.div();
d.array();
	}

}