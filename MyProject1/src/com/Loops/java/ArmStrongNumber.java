package com.Loops.java;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number1");
		int n=s.nextInt();
		int temp;
		temp=n;
		int sum=0;
        while(n>0) 
        {
	  
        	int r=n%10;
        	
        	sum=sum+r*r*r;
	         n=n/10;
       }
        if(temp==sum) {
    		System.out.println(temp+" is ArmStrong Number");
        }
        else {
    		System.out.println("Not Armstrong Number");
        }
         
	}

}
