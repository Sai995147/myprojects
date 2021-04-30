package com.Exceptions.java;

import java.util.Scanner;

public class Excptions4 {
	public  void div() {
		System.out.println("Connection is established");
		try {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int a=s.nextInt();
		System.out.println("Enter the Denominator");
		int b=s.nextInt();
		int c;
		c=a/b;
		System.out.println(c);
		int arr[]=new int[5];
		for(int i=0;i<=5;i++) {
			System.out.println("Enter the Array Elements");
	   arr[i]=s.nextInt();
		}
		s.close();
		}
	
		catch(ArithmeticException ae)
		{
			System.out.println("Some Problem Occured");
		}
       catch(ArrayIndexOutOfBoundsException e) {
    	   e.printStackTrace();
       }
		System.out.println("Connection is closed");
	
}
	public static void main(String[] args) {
Excptions4 e=new Excptions4();
e.div();
	}

}
