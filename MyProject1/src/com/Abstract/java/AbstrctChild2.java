package com.Abstract.java;
abstract class Parent1{

	int k=76;
	int d=25;
	//abstract Methods
	public abstract void add();
	//concrete Methods
	public void Mul() {
		int c;
		c=k*d;
	System.out.println(c);
	}
		
}
public class AbstrctChild2 extends Parent{

String str="hi";
int m=30;
int n=5;
	public void mod() {
        int c;
		c= m%n;
	System.out.println(c);
	
	}

@Override
public void add() {
	int c;
	c=m+n;
	System.out.println(c);
	
}
public static void main(String[] args) {
AbstrctChild2 ab=new AbstrctChild2();
//calling abstact method of child class
ab.add();


}
}