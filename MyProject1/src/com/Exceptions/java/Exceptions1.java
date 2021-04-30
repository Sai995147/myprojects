package com.Exceptions.java;

import java.util.Scanner;

public class Exceptions1 {
public static void div() {
	System.out.println("Connection is established");
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Numerator");
	int a=s.nextInt();
	System.out.println("Enter the Denominator");
	int b=s.nextInt();
	int c;
	c=a/b;
	System.out.println(c);
	s.close();
	System.out.println("Connection is closed");
}
	public static void main(String[] args) {
		Exceptions1.div();

	}

}
