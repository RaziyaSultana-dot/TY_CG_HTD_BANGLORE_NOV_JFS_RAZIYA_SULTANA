package com.capgemini.staticandnonstatic.initialization;

public class Person {
	int age;
	String name;
	
	void details()
	{
		System.out.println("age of "+name+" is "+age);
		
	}

	void initializ(int a,String n)
	{
		age=a;
		name=n;
		System.out.println("age of "+name+" is "+age);
	}
}
