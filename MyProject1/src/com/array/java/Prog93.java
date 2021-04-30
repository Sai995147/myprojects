package com.array.java;

public class Prog93 {
public static int getsecondLargest(int a[]) {
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	int k=a.length;
	return a[k-2];
}
	public static void main(String[] args) {
		int b[]= {44,98,66,99,77,33,22,55};
        System.out.println( "The second Largest Number is :"+Prog93.getsecondLargest(b));

	}

}
