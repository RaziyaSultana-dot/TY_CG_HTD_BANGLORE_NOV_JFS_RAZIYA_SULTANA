package com.capgemini.staticandnonstatic.Constructors;

public class Son extends Father {
	String name;
	int age;
	Son()
	{
		System.out.println("c");
		
	}
	
	Son(String name,int age)
	{
		System.out.println("d");
	}

}
