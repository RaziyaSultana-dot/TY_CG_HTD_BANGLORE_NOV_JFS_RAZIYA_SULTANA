package com.capgemini.checkedexception.checkedexcep;

public class Exceptionc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		Employee e=new Employee();
		try
		{
			Object o1=e.clone();
			System.out.println("clone is supported");
			try
			{
				Class c1=Class.forName("checkedexcep.Employee");
				System.out.println("class is found");
				
			}
			catch(ClassNotFoundException c) {
				System.out.println("class not found");
			}
		}catch(CloneNotSupportedException c)
		{
			System.out.println("clone not supported");
		}
		System.out.println("main ended");

	}

}
