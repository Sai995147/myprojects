package com.Loops.java;

import java.util.Scanner;

public class MaleFemale {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Gender");
		String gender=s.next();
 
		switch(gender) 
          {
            case  "Male"   :  System.out.println("Gender is "+"Male");
                                     break;
            case "FeMale" : System.out.println("Gender is "+"FeMale");
                                     break;
 
         }s.close();
		
	}

}
