package com.capgemini.staticandnonstatic.initialization;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		p.age=20;
		p.name="raz";
		p.details();
		
		Person p1=new Person();
		p1.initializ(25," john");

	}

}
