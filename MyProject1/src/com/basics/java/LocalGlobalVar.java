package com.basics.java;

class LG{
	//Global or Instance Variable
	int a=10;
	
	public int local(int a) //Local Variable
	{
		return a;
	}
	
}
public class LocalGlobalVar 
{

	public static void main(String[] args) 
	{
		LG l=new LG();
		//printing global variable
		System.out.println(l.a);
		//printing local variable
		System.out.println(l.local(15));

	}

}
