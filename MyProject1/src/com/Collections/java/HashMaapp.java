package com.Collections.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMaapp {

	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(101, "Sai");h.put(106, "Prasanna");
		h.put(102, "Kiran");h.put(107, "Vishnu");
		h.put(103, "Rishi");h.put(108, "Amar");
		h.put(104, "Abhi");h.put(109, "Raju");
		h.put(105, "Chandhu");h.put(110, "Hema");
		//fetching the value of key
		h.get(105);
     //creating an copy of hash map
		System.out.println("Initial Mappings are :"+h);
		System.out.println("After cloned map is :"+h.clone());
		//checking given key is in Hash map
		System.out.println(h.containsKey(105));
		
		//get the iterator over the hashMap
		Iterator<Map.Entry<Integer,String>> iterator=h.entrySet().iterator();
		
		//iterator over the hash map
		while(iterator.hasNext()) {
			Entry<Integer, String> entry=iterator.next();
			//
		}
			System.out.println(h.containsValue("Kiran"));
			System.out.println(h.isEmpty());
			System.out.println(h.size());
			Set<Integer> keys=h.keySet();
			for(Integer key: keys) {
				System.out.println(key);
			}
			
			h.remove(106, "Prasanna");
	}

}
