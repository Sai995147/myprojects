package com.Loops.java;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number");
		int n=s.nextInt();
		boolean flag=false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=true;
				break;
			}
		}
if(!flag) {
	System.out.println(n+" is Prime Number");
}
else 
{
	System.out.println(n+" is not Prime Number");
}
	}

}
