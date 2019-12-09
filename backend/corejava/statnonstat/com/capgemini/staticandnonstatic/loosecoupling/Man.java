package com.capgemini.staticandnonstatic.loosecoupling;

public class Man extends Atm {
	void drawcash(Atm a)
	{
		
		a.valid();
		a.withdraw();
	}



}
