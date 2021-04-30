package com.this_super.java;

public class Example3 {
	String str;
	String str1;
Example3()
{
	this("SAI","KUMAR");
	
}
Example3(String str,String str1)
{
	this.str=str;
	this.str1=str1;
	System.out.println(this.str+" "+this.str1);
	
}
	public static void main(String[] args) {
		Example3 e=new Example3();

	}

}
