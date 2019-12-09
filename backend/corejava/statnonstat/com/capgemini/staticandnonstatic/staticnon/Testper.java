package com.capgemini.staticandnonstatic.staticnon;

public class Testper {
	public static void main(String [] args)
	{
		Person p1=new Person();
		p1.name="raziya";
		Person.age=21;
		p1.testPerson();
	}

}
