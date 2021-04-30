package com.Collections.java;

import java.util.ArrayList;
import java.util.Iterator;

public class Arrylist {

	public static void main(String[] args) {
 ArrayList<String> al=new ArrayList<String>();
 al.add("Shylaja");al.add("Kiran");
 al.add("Kumar");al.add("Milky");
 al.add("Padma");al.add("Mahender");
 al.add("Sampath");al.add("Saikumar");
 al.add("Sandhya");al.add("Kishan");
 
 //created Object for listIterator
 Iterator<String> it=al.iterator();
 //iterating array list elements
 while(it.hasNext()) 
 {
 System.out.println(it.next());
 }
 System.out.println("-----------------------------<>-----------------------");
 //adding element at specific Index
al.add(2, "jashwika");
//removing element at specific index
al.remove(1);
//updating the element at specific index
al.set(2, "Srikanth");
//checking element at a particular index
System.out.println(al.contains("Saikumar"));
//getting element at a particular index
System.out.println(al.get(5));
//finding size of array list
System.out.println(al.size());
//removing all elements from array list
while(it.hasNext()) 
{
System.out.println(it.next());
}
al.removeAll(al);







	}


}
