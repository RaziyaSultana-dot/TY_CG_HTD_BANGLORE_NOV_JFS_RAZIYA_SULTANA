package com.capgemini.checkedexception.checkedexcep;

public class ExceptionA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		try
		{
			Class c1=Class.forName("checkedexcep.Person");
			System.out.println("class found");
		}
		 catch (ClassNotFoundException e)
		{
			 System.out.println("class not found");
		}
System.out.println("main ended");
	}

}
