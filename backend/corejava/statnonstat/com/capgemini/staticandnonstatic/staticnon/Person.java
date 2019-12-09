package com.capgemini.staticandnonstatic.staticnon;

public class Person {
	String name;
	static int age;
	
	void testPerson()
	{
		System.out.println("the age of"+name+"is"+age);
		Person. testpersond();
		
	}
	
	static void testpersond()
	{
		System.out.println(age);
	}
}
