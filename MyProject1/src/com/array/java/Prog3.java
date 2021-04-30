package com.array.java;

import java.util.Scanner;

public class Prog3 {

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
		
		System.out.println("Enter the array Element You Want");
		
		int ele=s.nextInt();
      for(int i=0;i<a.length;i++) 
      {
    	  if(a[i]==ele) 
    	  {
    		  System.out.println("Element Found At :"+i+"  th index");
    	  }
      }
      s.close();
	}

}
