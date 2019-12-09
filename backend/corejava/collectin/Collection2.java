package com.capgemini.collections.collectin;

import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1=new ArrayList();
		c1.add(10);
		c1.add(21);
		c1.add(65);
		System.out.println(c1);
		
		Collection c2=new ArrayList();
		c2.add(30);
		c2.add(51);
		c2.add(35);
		System.out.println(c2);
		//add all
		c1.addAll(c2);
		System.out.println(c1);
		
		//remove all
		c1.removeAll(c2);
		System.out.println(c1);
		//System.out.println(c2);
		
		
		Collection c3=new ArrayList();
		c3.add(33);
		c3.add(22);
		c3.add(34);
		c3.add(47);
		c3.add(78);
		System.out.println(c3);

		
		
		
		
		Collection c4=new ArrayList();
		c4.add(33);
		c4.add(23);
		c4.add(54);
		c4.add(45);
		c4.add(78);
				c3.containsAll(c4);
				System.out.println(c3);
				System.out.println(c4);
		
		
		
		Collection c5=new ArrayList();
		c5.add(30);
		c5.add(49);
		c5.add(78);
		c5.add(57);
		c5.add(23);
		System.out.println(c5);
		c3.containsAll(c5);
		System.out.println(c3);
		System.out.println(c5);


		c5.clear();
		System.out.println(c5);
		
		
		Collection c6=new ArrayList();
		c6.add(45);
		c6.add(78);
		
		Object a[]=c6.toArray();
		
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		
		

	}

}
