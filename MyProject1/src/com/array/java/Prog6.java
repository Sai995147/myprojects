package com.array.java;

import java.util.Scanner;

public class Prog6 {
	public void copyArray( ){
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
		for(int i=0;i<arr.length;i++) {
			a[i]=arr[i];
		}
		System.out.println("After copying The Array2 Elements are");
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
	
		}System.out.println();
		
		
		
		
	}
	public static void main(String[] args) {
	Prog6 p=new Prog6();
	p.copyArray();

	}

}
