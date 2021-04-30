package com.Accessmodifiers.java;
 class Demo {
	
	protected String s1="hello";
	protected String s2="Saikumar";
	
	protected void concat() {
		String s3=s1.concat(s2);
		System.out.println(s3);
	}

}
public class Demo2 extends Demo{
	
	//We can access protected members of a class in same package
	//we can access protected members and methods from a child class located in different package
	//We can't access protected members and methods from another class located in different package without is-a relationship
public static void main(String[] args) {
		Demo b=new Demo();
		System.out.println(b.s1);
		System.out.println(b.s2);
		b.concat();

	}
}
