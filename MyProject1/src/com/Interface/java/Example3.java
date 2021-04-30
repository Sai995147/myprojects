package com.Interface.java;

import java.util.Scanner;

interface M{
	public void addBalance();
	public void checkBalance();
	
}

public class Example3 implements M{

	float avail_blc=2000;
	@Override
	public void addBalance() {
		
			Scanner s=new Scanner(System.in);
			 System.out.println("Enter the Balance you want to add");
			 float blc=s.nextFloat();
			 avail_blc=this.avail_blc-blc;
			 System.out.println("Yor transaction succesfully Processed");
			 s.close();
	}

	@Override
	public void checkBalance()
	{
		 System.out.println("Balnace Available "+avail_blc);
			
		
	}
	public static void main(String[] args) 
	{
		
M m=new Example3();
m.addBalance();
m.checkBalance();

	}
}
