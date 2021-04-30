package com.Accessmodifiers.java;

class Demos{
public float r=50.0f;
public double pi=3.146;
public void circleArea() {
	 double d;
	d=pi*r*r;
	System.out.println(d);
}


}
public class Demo4 extends Demos{
public static void main(String[] args) {
		Demos d=new Demos();
		System.out.println(d.pi);
		System.out.println(d.r);
		d.circleArea();

	}
}
