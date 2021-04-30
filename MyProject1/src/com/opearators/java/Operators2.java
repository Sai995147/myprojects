package com.opearators.java;

public class Operators2 {
public static void incDec(int a,int b) {
    ++a;
     --b;
	System.out.println("The pre increment value of a is : "+a);
	System.out.println("The pre decrement value of a is : "+b);
	a++;
	b--;
	System.out.println("The post increment value of a is : "+a);
	System.out.println("The post increment value of a is : "+b);
}
	public static void main(String[] args) {
		Operators2.incDec(10, 20);

	}

}
