package com.array.java;

import java.util.Scanner;

public class Prog98 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Length of The Array");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the Elements Into The Array");
			a[i]=s.nextInt();
		}
		int sumOfAll=(n*(n+1))/2;
        int sumofArray=0;
    for(int i=0;i<=n-2;i++) {
    	sumofArray=sumofArray+a[i];
    }
    int missingNumber=sumOfAll-sumofArray;
	System.out.println("Missing Number is:"+missingNumber);
	s.close();
	}

}
