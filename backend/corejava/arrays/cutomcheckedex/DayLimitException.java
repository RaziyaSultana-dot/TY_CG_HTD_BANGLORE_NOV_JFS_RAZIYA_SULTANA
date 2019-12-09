package com.capgemini.arrays.cutomcheckedex;

public class DayLimitException extends RuntimeException{
	String msg = "exceeds daylimit";

	public DayLimitException() {
		super();
	}

	public DayLimitException(String msg) {
		super();
		this.msg = msg;
	}
	
 public  String getmessage()
 {
	 return this.msg;
 }
{
	
}
}
