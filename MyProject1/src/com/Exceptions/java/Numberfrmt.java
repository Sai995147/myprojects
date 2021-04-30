package com.Exceptions.java;

public class Numberfrmt {

	public static void main(String[] args) {
		try {
		Integer.parseInt(null);
		}
		catch(NumberFormatException fe) {
			System.out.println("Problem Caught");
		}
	}

}
