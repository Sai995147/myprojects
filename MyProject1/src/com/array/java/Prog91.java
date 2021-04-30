package com.array.java;

public class Prog91 {
public static void duplicateEle(int a[]) {
	int count=1;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
		if(a[i]==a[j]) {
			
			System.out.println("The Duplicate element "+count+" : "+a[j]);
			count++;
		}
		}
	}
		
	
}
	public static void main(String[] args) {
		int b[]= {10,1,25,36,45,10,54,10,82,54,23};
		
Prog91.duplicateEle(b);
	}

}
