package com.org.capgem.htd.trainingsec;

public class Student {
	protected String stuname;
	
	
	protected Student(String stuname)
	{
		this.stuname=stuname;
	}
	
	protected void details()
	{
		System.out.println("student name is "+ stuname);
	}

}
