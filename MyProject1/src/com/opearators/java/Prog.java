package com.opearators.java;

public class Prog {

	public static void main(String[] args) {
		int a[]= {10,50,4,3,6,9,8,12,32};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min)
			 min=a[i];
			}
		System.out.println(min+" --is smallest number");
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j])
			 temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}
			int b=a.length;
			int max=a[b-2];
			System.out.println(max+" --is largest number");
		

	}

}
