package com.capgemini.Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HahMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		System.out.println("enter a value");

		int a = sc.nextInt();
		System.out.println("enter b value");

		String b =sc.next();
		h1.put(a,b);
		
//		h1.put(10,"somesh");
//		h1.put(6,"Rajesh");
//		h1.put(2,"himesh");
		
		Set<Map.Entry<Integer,String>> s1=h1.entrySet();
		
		for(Map.Entry<Integer, String> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("--------------");
		}

	}

}
