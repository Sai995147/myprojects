package com.Interface.java;

import java.util.Scanner;

interface K
{
	public void withDraw();
}
interface L
{
	public void checkBlc();
}

public class Example4 implements K,L{
	float avail_blc=2000;
	public void withDraw() {
		Scanner s=new Scanner(System.in);
		
		 System.out.println("Enter the Balance you want to Withdraw");
		 
		  float blc=s.nextFloat();
		 
		 avail_blc=this.avail_blc+blc;
		 
		 System.out.println("Yor transaction succesfully Processed");
		 s.close();
}

	public void checkBlc()
	{

		 System.out.println("Balnace Available "+this.avail_blc);
	}
	public static void main(String[] args) {
		K k=new Example4();
		k.withDraw();
		L l=new Example4();
		l.checkBlc();
		
	}
	

}
