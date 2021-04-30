package com.Interface.java;
public  interface Example8
{
	int a=50;
	int b=5;
	default void mul() {
		int c;
        c =a-b;
       System.out.println(c);
	}

}
class Child implements Example8{
	public static void main(String args)
{
		
Child ref=new Child();
System.out.println(ref.a);
System.out.println(ref.b);
ref.mul();
}
}