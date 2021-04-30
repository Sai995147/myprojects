package com.inheritance.java;
class Parent1{
	int a=10;
	int b=20;
	public void overRiddd() {
		System.out.println("This is ccommon method for all child classes");
		
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
class Parent2 extends Parent1{
	int c=25;
	int d=5;
	public void overRiddd() 
	{
		System.out.println("welcome to java Programming world");
	}
	public void div() 
	{
		
		int k=c/d;
       System.out.println(k);
	
	}
	public void mod() {
		    int k=c%d;
	       System.out.println(k);
	}
}
class Child extends Parent2{
	public void overRiddd() 
	{
		System.out.println("Omg!..This is Child Class");
	}
	public void ShowSkills() {
		System.out.println("I am good in Java html css and javascript ");
	}
	public void hobbies() {
		System.out.println("I love to play Cricket");
	}
}
public class MultilevelInherit {

	public static void main(String[] args) {
		
		Parent1 p =new Parent1();
		//Polymorphism achieved by performing loose coupling
		p.overRiddd();
		p.add();
		p.mul();
		//calling child class members
		p=new Parent2();
		p.overRiddd();
		System.out.println(p.a);
		System.out.println(p.b);
		//downcasing for calling child class specified methods
		Parent2 p1=(Parent2)(p);
		p1.div();
		p1.mod();
		p=new Child();
		p.overRiddd();
		//downcasting 
		Child c=(Child)(p);
		c.ShowSkills();
		c.hobbies();
		

	}

}
