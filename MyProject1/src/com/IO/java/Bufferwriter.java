package com.IO.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferwriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("xample.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Hai Hello");
		bw.newLine();
		char ch[]= {'s','a','i','k','u','m','a','r'};
        bw.write(ch);
        bw.newLine();
        bw.write("Welcome");
        bw.close();
       fw.close();
	}

}
