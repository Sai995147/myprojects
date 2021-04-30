package com.array.java;

public class Prog97 {
public int[] removeDuplicate(int a[]) {
	int temp[]=new int[a.length];
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++)
		if(a[i]==a[j]) {
			temp[i]=a[j];
		}
	}
	return temp;

	
}
	public static void main(String[] args) {
	
Prog97 p=new Prog97();
int a[]= {20,25,62,74,83,25,32,20,25,69,62};
int b[]=p.removeDuplicate(a);
for(int i=0;i<b.length;i++) 
      {
	System.out.print(b[i]+" ");
      }
System.out.println();
	}

}
