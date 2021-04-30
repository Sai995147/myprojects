package com.array.java;

public class Prog2 {
	public static int averageValue(int[] a) {
		int sum = 0;
		int avg;
		 for(int i=0;i<a.length;i++) {
			 sum=sum+a[i];
			 
		 }
		 avg=sum/a.length;
		 return avg;
	}

	public static void main(String[] args) {
	int a[]= {10,25,78,63,54,32};
	
	int avg=Prog2.averageValue(a);
	System.out.println("The Average Value of an array :"+avg);

	}

}
