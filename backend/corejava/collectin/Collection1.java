package com.capgemini.collections.collectin;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c=new ArrayList();
	//adding ana element
		c.add(12);
		System.out.println(c);
		
		c.remove(12);
		System.out.println(c);
		
		System.out.println(c.size());
		
		System.out.println(c.isEmpty());
		
		c.add(12);
		System.out.println(c);
		
		System.out.println(c.contains(c));
		
		c.remove(12);
		System.out.println(c);
		
		
	}

}
