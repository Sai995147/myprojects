package com.Exceptions.java;

import java.util.Scanner;

class A
{
	public static void arrayIndex() throws ArrayIndexOutOfBoundsException{
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<=5;i++) {
			System.out.println("Enter the Array Elements");
	   a[i]=s.nextInt();
	   
		}s.close();
	}
}
public class Excptions3 {
 
	public static void main(String[] args) {
		A.arrayIndex();

	}

}
