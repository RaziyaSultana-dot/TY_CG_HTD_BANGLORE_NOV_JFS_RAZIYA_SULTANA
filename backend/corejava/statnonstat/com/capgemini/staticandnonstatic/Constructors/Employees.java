package com.capgemini.staticandnonstatic.Constructors;

public class Employees {
	String name;
	int age;
	int salary;
	
	Employees(String n,int a,int s)
	{
		name=n;
		age=a;
		salary=s;
	}

	void details() {
		System.out.println("name "+name+" age "+age+ " salary "+salary);
	}
}
