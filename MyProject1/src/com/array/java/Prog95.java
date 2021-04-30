package com.array.java;

public class Prog95 {
	
	public static int largeSmallDiff(int a[]) {
		
		int diff=0;
		int min=a[0];
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
				
			}
		}
		System.out.println("The minimum element in array is: "+min);
		for(int j=0;j<a.length;j++) {
			if(a[j]>max) {
				max=a[j];
			}
		}
		System.out.println("The maxmum element in array is: "+max);
		diff=max-min;
		return diff;
	}
	
	
	public static void main(String[] args) {
	
		int a[]= {10,5,41,25,66,89,76,45,4,29,32};
		System.out.println("The differnceBetween Max and min of Array is  :" +Prog95.largeSmallDiff(a));

	}

}
