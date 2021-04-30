package com.array.java;

public class Prog92 {
 public static void commonValues(int a[],int b[]) {

	 for(int i=0;i<a.length;i++) {
		 for(int j=0;j<b.length;j++) {
			 if(a[i]==b[j]) {
				System.out.println("The common elements are  :"+a[i]);
			 }
		 }
	 }
 }
	public static void main(String[] args) {
		int a[]= {10,47,89,54,25,36,87};
		int b[]= {28,32,89,55,47,36,25,101};
		Prog92.commonValues(a, b);

	}

}
