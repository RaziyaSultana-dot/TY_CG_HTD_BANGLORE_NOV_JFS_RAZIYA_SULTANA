package com.capgemini.staticandnonstatic.Constructors;

public class Father {
	String name;
	int age;
	Father()
	{
		System.out.println("a");
	}
	
	Father(String n,int a)
	{
		this();
		System.out.println("b");
	}

}
