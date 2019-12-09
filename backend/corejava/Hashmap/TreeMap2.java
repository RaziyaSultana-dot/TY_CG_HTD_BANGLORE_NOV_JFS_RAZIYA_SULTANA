package com.capgemini.Hashmap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {

	public static void main(String[] args) {
		TreeMap<Student1,String> t1=new TreeMap<Student1,String> ();
		t1.put(new Student1("taniya",15),"Standard10");
		t1.put(new Student1("bebo",17),"Standard12");
		t1.put(new Student1("kalyani",12),"Standard7");

		
Set<Map.Entry<Student1,String>> s1=t1.entrySet();
		
		for(Map.Entry<Student1, String> e1:s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-----------------------------");
			
//			System.out.println(t1.containsKey(34));
//			System.out.println(t1.containsValue(new Student1("taniya",154622)) );		}
//		
//		

	}

	}
}
