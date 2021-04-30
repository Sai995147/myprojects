package com.Exceptions.java;

public class ClassNotFund {

	public static void main(String[] args) {
		try {
			Class.forName("Program.java");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
