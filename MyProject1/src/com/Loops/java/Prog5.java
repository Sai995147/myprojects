package com.Loops.java;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number1");
		int a=s.nextInt();
		System.out.println("Enter The Number2");
		int b=s.nextInt();
		System.out.println("Enter The Number3");
		int c=s.nextInt();
		
		if(a>b & a>c) {
			System.out.println("The Largest Number is "+a);
		}else if(b>a & b>c) {
			System.out.println("The Largest Number is "+b);
		}else {
			System.out.println("The Largest Number is "+c);
		}
	}

}
