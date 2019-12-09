package com.capgemini.staticandnonstatic.Overriding;

public class Caluclator {
	 int add(int a)
	 {
		 return a*a;
	 }
	
	int add(int a,int b)
	{
		return a+b;
	}
	
	 double add(double a)
	 {
		 return a+a;
	 }
	 
	static  double multiply(double a,double b)
		{
			return a*b;
		}
	

}
