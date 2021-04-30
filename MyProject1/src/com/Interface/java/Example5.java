package com.Interface.java;
interface Ex
{
int avail_blc=5000;
	public void checkBlc();
}
interface Ex1{
	public void checkBlc();
}
public class Example5 implements Ex,Ex1
{


	public void checkBlc()
	{
	System.out.println("The balance Available :"+avail_blc);
	}
	public static void main(String[] args) 
	{
		Ex1 e=new Example5();
		e.checkBlc();

	}
}
