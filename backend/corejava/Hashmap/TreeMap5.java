package com.capgemini.Hashmap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap5 {

	public static void main(String[] args) {
    
	
	ArrayList l1=new ArrayList();
	l1.add(new Studentt("divya",25));
	l1.add(new Studentt("sivya",25));
	l1.add(new Studentt("fivya",25));
	
	ArrayList l2=new ArrayList();
	l1.add(new Studentt("divya",25));
	l1.add(new Studentt("sivya",25));
	l1.add(new Studentt("fivya",25));
	
	ArrayList l3=new ArrayList();
	l1.add(new Studentt("dkvya",25));
	l1.add(new Studentt("sghasvya",25));
	l1.add(new Studentt("fiss",25));
	
	TreeMap<String,ArrayList<Studentt>> t1=new TreeMap<String,ArrayList<Studentt>> ();
	t1.put("standard1", l1);
	t1.put("stardard2",l2);
	t1.put("standard3",l3); 
	
	Set<Map.Entry<String,ArrayList<Studentt>>> s1=t1.entrySet();
	
	for(Entry<String, ArrayList<Studentt>> t11:s1) {
		System.out.println(t11.getKey());
		System.out.println(t11.getValue());
		System.out.println("-----------------------------");
	}	

}
}