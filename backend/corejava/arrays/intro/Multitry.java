package com.capgemini.arrays.intro;

public class Multitry {
	void excep(int a, String b)
	{
		try {
		System.out.println(10/a);
		 try {
		System.out.println(b.length());
	         
		    }
		 
		catch(ArithmeticException A)
		{
			System.out.println("dont deal with zero yaar");
		}
		}
		catch(NullPointerException n)
		{
			System.out.println("dont deal with null yaar");
		}
		
		

	}
}
