package com.capgemini.collection.ListArr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		System.out.println(l1);
		
		l1.remove(2);
		System.out.println(l1);
		
		System.out.println("--------for loop-------");
		for(int i=0;i< l1.size();i++) {
			System.out.println(l1.get(i));
			
		}
		
		System.out.println("--------for each loop---");
		for(Integer i1 : l1) {
			System.out.println(i1);
		}
		
		System.out.println("-----iterator method----");
		Iterator<Integer>itr =l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----List iterator method----");
		ListIterator<Integer>itr1 =l1.listIterator();
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
		ListIterator<Integer>itr2 =l1.listIterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(23);
		a2.add(24);
		System.out.println(a2);
		a2.remove(new Integer(23));
		System.out.println(a2);
		

	}

}
