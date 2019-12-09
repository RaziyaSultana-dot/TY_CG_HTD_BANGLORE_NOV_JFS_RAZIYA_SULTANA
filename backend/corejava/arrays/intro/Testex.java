package com.capgemini.arrays.intro;

public class Testex {
	
	 void write()
	{
		String s=null;
		
		try {
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("better dont deal with me-null");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testex t=new Testex();
		t.write();

	}

}
