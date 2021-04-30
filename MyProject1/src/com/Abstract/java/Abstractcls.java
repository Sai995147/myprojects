package com.Abstract.java;
abstract class A
{
	public abstract void greet();
	
	public void teach() {
		System.out.println("Teacher is Teaching");
	}
}
 class B extends A{

	@Override
	public void greet() {
		
		System.out.println("Welcome to the class");
	}
	public void markAttendance() 
	{
		System.out.println("Teacher is taking Attendance");
	}
	
}
public class Abstractcls {

	public static void main(String[] args) {
		B b=new B();
		b.greet();
		b.teach();
		b.markAttendance();

	}

}
