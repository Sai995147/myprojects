package com.Exceptions.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileNotFund {

	public static void main(String[] args) throws IOException {
	File f=new File("abc.text");
	//Io Exception
	try {
		FileWriter f1=new FileWriter(f);
		f1.write(121);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//FileNotFound Exception
	try {
		FileReader f3=new FileReader("abc.text");
		f3.read();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
