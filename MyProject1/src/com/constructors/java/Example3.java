package com.constructors.java;
class Constructor
{
	int a;
	String str;
	//constructor with private modifier
	private Constructor() {
	
	}
	//constructor with public modifier
	public Constructor(int a){
		this.a=a;
	}
	//constructor with protected modifier
	protected Constructor(String str) {
		this.str=str;
	}
	//constructor with default modifier
     Constructor(int a,String str){
		
	}
}
public class Example3 {

	public static void main(String[] args) {
		//Constructor c=new Constructor();
		Constructor c=new Constructor(50);
		Constructor c1=new Constructor("Saikumar");
		Constructor c2=new Constructor(101,"Hi sai");

	}

}
