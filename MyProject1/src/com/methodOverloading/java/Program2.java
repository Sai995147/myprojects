package com.methodOverloading.java;

public class Program2 {

		public void add(int a,int b,int c)
		{
		int d=0;
		d=a+b+c;
		System.out.println(d);
		}
		public void sub(int a,int b) 
		{
			int k=0;
			k=a-b;
			System.out.println(k);
		}
public static void main(String[] args) {
		Program2 p=new Program2();
		p.add(10, 20, 30);
		p.sub(2800, 2500);

}
}