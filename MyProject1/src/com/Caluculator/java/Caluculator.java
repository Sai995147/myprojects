package com.Caluculator.java;

import java.util.Scanner;

public class Caluculator 
{
	 int a;
	 char c;
	 int b;
	 Caluculate ref=new Caluculate(a,c,b);

	
	public void acceptInput(){
   Scanner sc=new Scanner(System.in);
	System.out.println("Enter the FirstNumber");
	 a=sc.nextInt();
	System.out.println("Enter the Operation you want to Perform(+,-,*,/)");
     c=sc.next().charAt(0);	
	System.out.println("Enter the SecondNumber");
	 b=sc.nextInt();
	 sc.close();
	System.out.println(a+" "+c+" "+b);
	}


	
}
	
	
	
	
	


