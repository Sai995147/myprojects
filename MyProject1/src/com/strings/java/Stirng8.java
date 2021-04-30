package com.strings.java;

public class Stirng8 {

	public static void main(String[] args) {
		String s1="saikumar";
		String s2="SAIKUMAR";
		String s3="Rajesh";
		if(s1.equalsIgnoreCase(s2)) {
			 System.out.println("strings are equal by ignoring cases");
		}else {
			 System.out.println("strings are not equal");
		}
		System.out.println("-------------------------------------");
System.out.println(s1.startsWith("s"));//true
System.out.println(s1.startsWith("k"));//false
System.out.println(s1.endsWith("r"));//true
System.out.println(s1.startsWith("m"));//false
System.out.println("-------------------------------------");
System.out.println( s1.compareTo(s3));
System.out.println( s1.compareToIgnoreCase(s3));
	}

}
