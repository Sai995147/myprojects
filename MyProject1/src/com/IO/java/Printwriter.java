package com.IO.java;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Printwriter {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		PrintWriter pw=new PrintWriter("sai.txt");
pw.print(10);
pw.print(false);
pw.println(10.55);
pw.print('c');
pw.println(154548461);
pw.print("saikumar");
pw.close();
	}

}
