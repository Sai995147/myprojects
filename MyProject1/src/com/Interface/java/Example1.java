package com.Interface.java;
interface A
{

	public void checkBalance();
	
}
public class Example1 implements A {

	
	@Override
	public void checkBalance() {
     float avail_blc=5000;
     System.out.println("Balnace Available "+avail_blc);
	}
	public static void main(String[] args) 
	{
		
     Example1 e=new Example1();
      e.checkBalance();
	}


}
