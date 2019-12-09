package com.capgemini.collection.ListArr;


import java.util.ArrayList;
import java.util.List;
public class List1 {
	public static void main(String[] args) {
		List l1=new ArrayList();
		
		l1.add(0,12);
		l1.add(1,15);
		l1.add(2,7);
		l1.add(3,84);
		l1.add(4,75);
		l1.add(1,158);
		System.out.println(l1);
		
		l1.remove(2);
		System.out.println(l1);
		System.out.println(l1.indexOf(84));
		l1.add(84);
		System.out.println(l1.lastIndexOf(84));
		for(int i=0;i<l1.size();i++) {
		System.out.println(l1.get(2));
		}
ArrayList l2=new ArrayList();
		
		l2.add(0,12);
		l2.add(1,15);
		l2.add(2,7);
		l2.add(3,84);
		l2.add(4,75);
		
		
ArrayList l3=new ArrayList();
		
		l3.add(0,35);
		l3.add(1,74);
		l3.add(2,45);
		l3.add(3,8);
		l3.add(4,5);
		System.out.println(l3.addAll(3, l2));
		
		System.out.println(l3.set(1, 74));
		
ArrayList l4=new ArrayList();
		
		l4.add(0,35);
		l4.add(1,74);
		l4.add(2,45);
		l4.add(3,8);
		l4.add(4,5);
		l4.set(1, 100);
		System.out.println(l4);
		
		List l41=l2.subList(0, 2);
		System.out.println(l41);

		
	}

}
