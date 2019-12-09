package com.capgemini.arrays.cutomcheckedex;

public class SBIatm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		ATMsimulator a1=new ATMsimulator();
		try {
			a1.withdraw(41000);
		}
		catch(DayLimitException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("main ended");

	}

}
