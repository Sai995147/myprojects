package com.array.java;

public class Prog7 {
public static void insertIntoArray(int pos,int ele) {
	int a[]= {10 ,2 ,45,60,70,30, 80, 70, 30 ,50 };
	
	System.out.println("The Array Elements Are");
	for(int i=0;i<a.length;i++) 
	{
		System.out.print(a[i]+" ");

	}
	System.out.println();
	
for(int i=a.length;i<pos;i++) {
	
	a[i]=a[i-1];
		
	}
    a[pos]=ele;

System.out.println("After inserting The Array Elements Are");
for(int i=0;i<a.length;i++) 
{
	System.out.print(a[i]+" ");

  }
System.out.println();
}


	public static void main(String[] args) {
		
		Prog7.insertIntoArray(4, 33);
		
	
	}

}
