package com.Abstract.java;

abstract class Parent{

	int a=100;
	int b=20;
	//abstract Methods
	public abstract void add();
	//concrete Methods
	public void Mul() {
		int c;
		
		c=a*b;
	System.out.println(c);
	}
		
}
public class AbstrctChild extends Parent{

	@Override
	public void add() {
        int c;
		c=a+b;
	System.out.println(c);
	
	}
	
public static void main(String[] args) {
		
Parent obj=new AbstrctChild();
       System.out.println(obj.a=50);
      System.out.println(obj.b);
      //calling child class implementation method and inherited method
      obj.add();
      obj.Mul();
	}

}
