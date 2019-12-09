package com.capgemini.staticandnonstatic.loosecoupling;

public class Mainatm {
	public static void main(String [] args)
	{
		Hdfc h= new Hdfc();
		Sbi s=new Sbi();
		Icici I= new Icici();
		Man m= new Man();
		
		Atm a=new Atm();
		
		m.drawcash(I);
		
		
	}

}
