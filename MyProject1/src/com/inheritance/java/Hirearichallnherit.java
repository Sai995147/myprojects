package com.inheritance.java;

 class Pareent {

			int a=10;
			int b=20;
			public void overRiddden() {
				System.out.println("Override it");
				}
			public void add() 
			{
				int c=a-b;
		       System.out.println(c);
			
			}
			public void mul() {
				    int c=a*b;
			       System.out.println(c);
	      	}

}
class Child1 extends Pareent
    {
	public void overRiddden() 
	{
		System.out.println("Am Child1 i have Overridden it");
	}
	
}

class Child2 extends Pareent
   {
	public void overRiddden() {
		System.out.println("Am Child2 i have too Overridden it..HAHAHA");
		}

}
public class Hirearichallnherit
{
	public static void main(String[] args) {
		Pareent p=new Child1();
		p.overRiddden();
		p.add();
		p.mul();
		Pareent p1=new Child2();
		p1.overRiddden();
		p1.add();
		p1.mul();
	}
}