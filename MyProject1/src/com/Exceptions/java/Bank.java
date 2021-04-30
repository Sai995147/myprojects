package com.Exceptions.java;

import java.util.Scanner;

//creating My Own Exception Class
class InvalidException extends Exception{
	public String getMessege() {
		return "Invalid Input";
		
	}
}
class ATM{
	int accno=9999;
	int pwd=8888;
	int an;
	int pw;
	public void acceptInput() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Account Number");
		an=s.nextInt();
		System.out.println("Enter the Password");
		pw=s.nextInt();
	}
	public void verify() throws InvalidException {
		if(accno==an && pwd==pw) {
			System.out.println("Collect The cash");
		}
		else {
			InvalidException e=new InvalidException();
			System.out.println(e.getMessege());
			throw e;
		}	
	}
}
public class Bank {

	public static void main(String[] args) {
		ATM a=new ATM();
		a.acceptInput();
		try {
			a.verify();
		} catch (InvalidException e) {
		
		System.out.println("Exception reached at bank class");
		}

	}

}
