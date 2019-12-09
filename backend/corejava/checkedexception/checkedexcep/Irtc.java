package com.capgemini.checkedexception.checkedexcep;

public class Irtc {
	void confirmticket() throws ClassNotFoundException{
		try {
			Class.forName("checkedexcep.Paytm");
			System.out.println("ticked is confirmed");
		}
		catch(ClassNotFoundException c) {
			System.out.println("ticket is not confirmed...go and book somewhere else");
			throw c;
		}
	}

}
