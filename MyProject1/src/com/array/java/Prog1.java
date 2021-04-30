package com.array.java;

import java.util.Scanner;

public class Prog1 {

	
	public static void addIntegers(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
				sum=sum+a[i];
			}
			
		System.out.println("Sum of Integer Arrray Elements is :"+sum);
		}
	//Main Method
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the Elements Into The Array");
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
	
		}
		System.out.println();

	
	Prog1.addIntegers(a);
	
	
	
	
	}
}
