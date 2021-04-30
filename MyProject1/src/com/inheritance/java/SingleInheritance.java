package com.inheritance.java;
//Creating Parent class

class Parent{
	int i;
	float f;
	Parent(int i,float f){
		this.i=i;
		this.f=f;
	}
	public void add() {
		float f1=i+f;
		System.out.println("Sum of Two Numbers"+f1);
	}
}
//creating Child Class

public class SingleInheritance extends Parent
{
String s;
	SingleInheritance(String s) {
	super(10,15);   
	    this.s=s;

		}
	public void mul() {
		String s=i+this.s;
		System.out.println("Sum of Two Numbers "+s);
	}
		public static void main(String[] args) {
			 SingleInheritance s=new  SingleInheritance("sai");
			 s.mul();
			 Parent p=new Parent(50, 70);
			 
			 System.out.println(p.i);
		}

	}


