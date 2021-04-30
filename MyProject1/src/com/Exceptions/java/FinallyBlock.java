package com.Exceptions.java;

public class FinallyBlock {
	public static void ArithPrblm() {
try {
	int a=25;
	int b=0;
	int c=a/b;
}catch(NullPointerException e) {
	System.out.println(e);
}
finally{
	System.out.println("finally Block is always Executed");
	int a=10,b=5;
	int c=a/b;
	System.out.println(c);
}
	}

	public static void main(String[] args) {
	
FinallyBlock.ArithPrblm();
	}

}
