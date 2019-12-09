package com.capgemini.checkedexception.customchecked;

public class Election {
	void vote(int age) throws Agelimitexc{
		if(age<18)
		{
			throw new Agelimitexc();
		
		}
		else {
			System.out.println("allowed for voting");
		}
	}

}
