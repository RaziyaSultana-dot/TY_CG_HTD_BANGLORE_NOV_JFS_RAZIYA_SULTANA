package com.capgemini.staticandnonstatic.loosecoupling;

public class Mainchips {
	public static void main(String [] args)
	{
		Chips ch=new Chips();
		Lays l=new Lays();
		Bingo b=new Bingo();
		Cat c=new Cat();
		
		c.feedcat(l);
	
		
	}

}
