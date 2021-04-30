package com.Loops.java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=s.nextInt();
		int temp,sum=0;;
		temp=n;
		while(temp>0) {
			int r;
			r=temp%10;
			sum=(sum*10)+r;
			temp=temp/10;
		}
		if(n==sum)
		{
			System.out.println(n+" is Palindrome Number");
		}
		else 
		{
			System.out.println(n+" is Not A Palindrome Number");
		}
	}

}
