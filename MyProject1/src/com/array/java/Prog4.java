package com.array.java;

public class Prog4 
{
	public void specificValue(int b) {
		
		int a[]= {111,45,728,62,53,32,9};
		
      for(int k=0;k<a.length;k++) 
      {
    	  if(a[k]==b) 
    	  {
    		  System.out.println("Element Found ");
    	      break;
    	  }
      }
	}

	public static void main(String[] args) {
	Prog4 p=new Prog4();
		
		p.specificValue(32);

	}

}
