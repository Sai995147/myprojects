package com.methodOverloading.java;

public class Program3 {

	public void add(int a,int b)
		{
		int d=0;
		d=a+b;
		System.out.println(d);
		}
		public void sub(float a,float b,float c) 
		{
			float k=0;
			k=a-b+c;
			System.out.println(k);
		}
		public static void main(String[] args) {
			
			Program3 p=new Program3();
			p.add(14, 28);
			p.sub(50.2f, 60.35f,110.0f);
			
	}

}
