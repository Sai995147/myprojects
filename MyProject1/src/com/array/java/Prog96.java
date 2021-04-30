package com.array.java;

public class Prog96 {
public static void verify(int a,int b) {
	int arr[]= {10,25,41,12,45,78,69,23,85,61};
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==a || arr[i]==b) {
			System.out.println("Elemenets found at :"+ i +" th Position of Array");
		}
	}
}
	public static void main(String[] args) {
		
Prog96.verify(12, 23);
	}

}
