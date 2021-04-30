package com.Loops.java;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number1");
		int n=s.nextInt();
      switch(n%2) {
      case 0 : 
    		System.out.println("Even Number");
            break;
      case 1 :
    	  System.out.println("Odd Number");
          break;
    	      
      }
      s.close();
	}
}

