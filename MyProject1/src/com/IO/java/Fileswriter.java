package com.IO.java;

import java.io.FileWriter;
import java.io.IOException;

public class Fileswriter {

	public static void main(String[] args) throws IOException {
/*File f=new File("sample.txt");
System.out.println(f.exists());
f.createNewFile();
System.out.println(f.exists());*/
FileWriter fw=new FileWriter("sample1.txt");
fw.write(100);
fw.write("sai\nHai Hello");
fw.write('\n');
char[] ch= {'a','b','c'};
fw.write(ch);
fw.close();
	}

}
