package com.capgemini.Hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer , Employee> l1=new LinkedHashMap<Integer , Employee>();
		l1.put(34,new Employee("taniya",154622));
		l1.put(78, new Employee("samiya",44622));
		l1.put(48, new Employee("johnny",954622));
		
		System.out.println(l1.get(78));
		
		Set<Map.Entry<Integer,Employee>> s1=l1.entrySet();
		
		for(Map.Entry<Integer,Employee> e1:s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-----------------------------");
			
			System.out.println(l1.containsKey(34));
			System.out.println(l1.containsValue(new Employee("taniya",154622)) );		}
		
		
		

	}

}
