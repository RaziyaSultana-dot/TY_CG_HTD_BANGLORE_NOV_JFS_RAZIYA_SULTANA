package com.capgemini.checkedexception.checkedexcep;

public class Paytm {
	Irtc i1;
	public Paytm(Irtc i1){
		this.i1=i1;
	}
	void bookticket()
	{
		try {
			i1.confirmticket();
		}
		catch(ClassNotFoundException c) {
			System.out.println("go and die");
		}
	}

}
