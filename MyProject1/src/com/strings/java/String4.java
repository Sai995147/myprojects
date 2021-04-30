package com.strings.java;

public class String4 {
	public static int length(String str) {
		//Method to find the length
		char[] ch=str.toCharArray();
		 int length=0;
		for(int i=0;i<ch.length;i++) {
			length++;
		}
		return length;
	}

	public static void main(String[] args) {
		String s1="Hi saikumar";
		//calling the Method
	 int length=String4.length(s1);
	 System.out.println("-----------Length of given string---------- ");
      System.out.println(length);
       
	}

}
