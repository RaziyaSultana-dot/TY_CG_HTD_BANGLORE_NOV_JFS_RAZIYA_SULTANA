package com.capgemini.interfaces.interfaces;

public class Pepsii implements Bottlei{

	@Override
	public void drink() {
		
		System.out.println("drink pepsi");
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("open pepsi");
	}
	
public void juice() {
	System.out.println("pepsi juice ");//overidden juice method
}
}
