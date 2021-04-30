package com.Exceptions.java;

import java.util.Scanner;

public class Excptions2 {
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
			s.close();
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Some Problem Occured");
			}
	
			System.out.println("Connection is closed");
		
}
		public static void main(String[] args) {

		Excptions2 e=new Excptions2();
		e.div();
		
		
		
		
		}
}
