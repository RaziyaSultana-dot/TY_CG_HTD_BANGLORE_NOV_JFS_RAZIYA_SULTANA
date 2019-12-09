package com.capgemini.checkedexception.customchecked;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		Election e1=new Election();
		try {
			e1.vote(15);
		}
		catch(Agelimitexc e) {
			System.out.println(e.getMessage());
		}
		System.out.println("ended");

	}

}
