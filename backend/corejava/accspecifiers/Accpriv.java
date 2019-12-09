package com.org.capgemini.htd.priv;

public class Accpriv {
	private String name;
	
	private Accpriv(String name)
	{
      this.name=name;		
	}
	
	private void details()
	{
		System.out.println("my name is"+name);
	}

}
