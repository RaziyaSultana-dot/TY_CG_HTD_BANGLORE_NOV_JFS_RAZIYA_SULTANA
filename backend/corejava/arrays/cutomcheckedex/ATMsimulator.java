package com.capgemini.arrays.cutomcheckedex;

public class ATMsimulator {

	void withdraw(double amount) {
		if(amount >40000) {
			throw new DayLimitException();
		}
	}
}
