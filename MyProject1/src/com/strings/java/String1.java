package com.strings.java;

public class String1 {

	public static void main(String[] args) {
		//Creating Immutable Strings
		String s1="hai";
		String s2=new String("Hello");
		char ch[]= {'s','a','i','k','u','m','a','r'};
		String s3=new String(ch);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//Creating Mutable Strings
		
		StringBuilder sb=new StringBuilder("Saikumar");
		StringBuffer s=new StringBuffer("Sai");
		System.out.println(sb);
		System.out.println(s);
	}

}
