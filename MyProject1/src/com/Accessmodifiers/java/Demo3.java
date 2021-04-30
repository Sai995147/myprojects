package com.Accessmodifiers.java;
class Default{
	int a=10;
	int b=20;
	void mul() {
		int c;
		c=this.a*this.b;
		System.out.println(c);
	}
}
public class Demo3 extends Default {
	
/*we can access default members and methods from another
	class in the same package but 
	not possible at all in other package*/
	
	public static void main(String[] args) {
		//Default d=new  Default();
		Demo3 d=new Demo3();
		System.out.println(d.a);
		System.out.println(d.b);
		d.mul();

	}

}
