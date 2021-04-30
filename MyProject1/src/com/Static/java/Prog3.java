package com.Static.java;

class Demo2
{
	String s;
	//Instance Method
	public void print(String s) {
		this.s=s;
		System.out.println(this.s);
		
	}
	
	
	//static Method
	public static void print() {
		
		System.out.println("Hi..This is Static Method");
		/*calling Instance Method But its Not possible
		
		Instance Methods will get Memory after Instantiation of Object
		
	        print("Hello");
	*/
		
	}
	
	
	
	
	
}

public class Prog3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
