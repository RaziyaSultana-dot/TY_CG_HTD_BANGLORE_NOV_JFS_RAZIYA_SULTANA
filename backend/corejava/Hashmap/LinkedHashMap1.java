package com.capgemini.Hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Integer> l1= new LinkedHashMap<String,Integer>();
		l1.put("hebbal",520446);
		l1.put("btm",526466);
		l1.put("btr",5261164);
		l1.put(null,5261464);
		l1.put(null,null);

		Set<Map.Entry<String,Integer>> s1=l1.entrySet();

		for(Map.Entry<String,Integer>e1:s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println(l1.isEmpty());
			System.out.println(l1.containsKey("hebbal"));
			System.out.println(l1.containsValue(5261164));
			
			System.out.println("--------------------------------");

		}

	}

}
