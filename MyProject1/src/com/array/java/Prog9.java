package com.array.java;

import java.util.Scanner;

public class Prog9 {
	public static void ReverseArray( ){
		Scanner s=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the Elements Into The Array");
			arr[i]=s.nextInt();
		}
		System.out.println("The Array1 Elements Are");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
	
		}System.out.println();
		
		int a[]=new int[arr.length];
		int j=a.length-1;
		for(int i=0;i<arr.length;i++) {
			a[j]=arr[i];
			j--;
		}
		System.out.println("After Reversing The Array2 Elements are");
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
	
		}
		System.out.println();
		s.close();
	}
	public static void main(String[] args) {
		Prog9.ReverseArray();

	}

}
