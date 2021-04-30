package com.array.java;

public class Prog94 {
public static void getEvenodd(int a[]) {
	System.out.println("Even Numbers are :");
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			System.out.print(a[i]+" ");
		}
	}System.out.println();
	System.out.println("Odd Numbers are :");
	for(int i=0;i<a.length;i++) {
		if(a[i]%2!=0) {
			System.out.print(a[i]+" ");
		}
	}
}
	public static void main(String[] args) {
		int a[]= {10,5,41,25,66,89,76,45,4,29,32};
		Prog94.getEvenodd(a);

	}

}
