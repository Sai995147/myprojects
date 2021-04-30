package com.constructors.java;

public class Example5 {
public Example5() {
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example5 e=new Example5();
System.out.println(e);
/*  Note:The intent of constructor is to create the object.
 * so,each time you use the new operator,
 * the constructor is called and new object is created.
 * so you cannot call the constructor directly
 * 
 * */
Example5 e1=new Example5();

System.out.println(e1);
	}

}
