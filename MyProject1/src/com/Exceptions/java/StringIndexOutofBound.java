package com.Exceptions.java;

public class StringIndexOutofBound {

	public static void main(String[] args) {
	
			String str="Hi hello this is saikumar how are you?.";
			try {
			System.out.println(str.length());
			str.charAt(40);
		}catch(	StringIndexOutOfBoundsException si) {
			System.out.println("Some problem occured");
			
		}
			System.out.println(str.charAt(3));
	System.out.println("Problem Resolved");
	}
}
