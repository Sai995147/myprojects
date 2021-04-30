package com.Accessmodifiers1.java;

import com.Accessmodifiers.java.Demo2;

public class Protect extends Demo2 {
/*if we want Protected members of another class in different 
There must be a is-a relationship
*/
	public static void main(String[] args) {
		Protect p=new Protect();
		System.out.println(p.s1);
		System.out.println(p.s2);
		p.concat();

	}

}
