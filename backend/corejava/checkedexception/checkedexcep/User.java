package com.capgemini.checkedexception.checkedexcep;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		Irtc i1=new Irtc();
		Paytm p1=new Paytm(i1);
		p1.bookticket();
		System.out.println("ended");

	}

}
