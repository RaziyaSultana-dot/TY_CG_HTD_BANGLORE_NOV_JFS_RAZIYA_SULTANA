package com.capgemini.staticandnonstatic.Overriding;

public class Mainanimal {
	public static void main(String [] args)
	{
		Lion l=new Lion();
		l.eat();
		Animal a=new Lion();
		a.eat();
		
		Cat c=new Cat();
		c.eat();
	}

	
}
