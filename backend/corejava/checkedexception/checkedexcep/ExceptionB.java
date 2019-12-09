package com.capgemini.checkedexception.checkedexcep;

public class ExceptionB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		Student s1=new Student();
		try
		{
			Object o1=s1.clone();
			System.out.println("object is cloned");
			Class c1=Class.forName("checkedexcep.Student");
		}
		catch(CloneNotSupportedException e) {
			System.out.println("clone not supported");
		}
		catch(ClassNotFoundException c)
		{
			System.out.println("class not found");
		}
System.out.println("main ended");
	}

}
