package com.capgemini.objectclass.objcls;

public class Student1 implements Cloneable  {
	String name;
	public void Student1(String name)
	{
		//Super();
		this.name=name();
	}
	private String name() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
