package com.capgemini.staticandnonstatic.Constructors;

public class Mainconover {
	public static void main(String [] args)
	{
		Conover c=new Conover("shannu",21);
		System.out.println(c.stuname);
		System.out.println(c.stuage);
		
		Conover c1=new Conover();
		System.out.println(c1.stuname);
		System.out.println(c1.stuage);
		
	}

}
