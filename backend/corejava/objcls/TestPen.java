package com.capgemini.objectclass.objcls;

public class TestPen {
public static void main(String [] args) throws InstantiationException, IllegalAccessException
{
	Pen p1=new Pen("classmate");
	//System.out.println(p1.toString());
	Class<? extends Pen> c1=p1.getClass();
	//System.out.println(p1.getClass());
	//System.out.println(p1.hashCode());
	
	//Object o1=new Object();
	Pen p2=c1.newInstance();
	System.out.println(c1);
			System.out.println(p2.name);
}
}