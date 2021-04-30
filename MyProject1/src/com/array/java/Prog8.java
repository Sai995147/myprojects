package com.array.java;

public class Prog8 {
	public int minele(int a[])
	{
		int min=a[0];
		for(int i=0;i<a.length-1;i++) {
				if(a[i]<min) {
					min=a[i];
				}
			
		}return min;
	}
	public int maxele(int a[])
	{
		int max=0;
		for(int i=0;i<a.length-1;i++) {
	
				if(a[i]>max) {
					max=a[i];
			}
		}return max;
	}
	public static void main(String[] args) {
		int a[]= {100,21,85,60,70,30,80,70,47,50 };
		Prog8 p=new Prog8();
		int min=p.minele(a);
     System.out.println("The minimum element in Given Array is   :"+min);
     int max=p.maxele(a);
     System.out.println("The maximum element in Given Array is   :"+max);
	
	
	}

}
