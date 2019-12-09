package com.capgemini.Hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Student> h1 =new HashMap<Integer,Student>();
		h1.put(22,new Student("tanu",34));
		h1.put(21,new Student("tanya",84));
		h1.put(29,new Student("rani",36));
		h1.put(41,new Student("manu",30));
		
		Collection<Student> c1=h1.values();
		
		for(Student s1:c1) {
			System.out.println(s1);
		}
		
		Set<Integer> s1=h1.keySet();
		
		for(Integer i1:s1) {
			System.out.println(i1);
		}
		
			System.out.println(h1.containsKey(34));	
			System.out.println(h1.containsValue("tanya"));
			System.out.println(h1.size());
			
			
		}
		
		
		
		

	}


