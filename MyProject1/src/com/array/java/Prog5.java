package com.array.java;

public class Prog5 {
      public static void removeEle(int pos) {
    	  int a[]= {10,5,48,74,8,65,32,48,25};
    	  for(int i=pos+1;i<a.length;i++) {
    		  a[i-1]=a[i];
    	  }
    	  
    	  System.out.println("The elements After Deletion");
    	  
    	  for(int i=0;i<a.length;i++) {
    		  System.out.print(a[i]+" ");
    	  }
    	  
      }
	
	
	public static void main(String[] args) {
		Prog5.removeEle(1);

	}

}
