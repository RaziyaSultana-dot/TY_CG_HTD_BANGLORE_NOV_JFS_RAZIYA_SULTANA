package com.capgemini.staticandnonstatic.loosecoupling;

public class Cat extends Chips{
	void feedcat(Chips ch)
	{
		
		ch.open();
		ch.eat();
	}

}
