package com.opearators.java;

public class LogicalOp {

	public static void main(String[] args) {
		
	boolean a=true;
	boolean b=false;
	boolean c=true;
	boolean d=false;

	//using Logical AND
	if(b&b) {
		System.out.println("False");
		
	}
	else if(b&a)
	{
		System.out.println("Flase");
	}
	else if(a&b) 
	{
		System.out.println("False");
	}
	else if(a&a)
	{
		System.out.println("True");
	}
	//using Logical OR
		if(b || d) {
			System.out.println("False");
			
		}
		else if(b || c)
		{
			System.out.println("True");
		}
		else if(a || d) 
		{
			System.out.println("True");
		}
		else if(a || c)
		{
			System.out.println("True");
		}
//Using NOt operator
		if(!(a&b)) {
			System.out.println("Cndition satisfied it's True");
		}
	}

}
