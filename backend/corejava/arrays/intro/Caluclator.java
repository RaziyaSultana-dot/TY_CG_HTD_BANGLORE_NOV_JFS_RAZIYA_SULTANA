package com.capgemini.arrays.intro;

public class Caluclator {
	
	void divide(int a,int b)
	{
		try {
		System.out.println(a/b);
		}
		catch(ArithmeticException c)
		{
			System.out.println(" u idiot, dont do that");
		}
		System.out.println("divided");
	}

}
