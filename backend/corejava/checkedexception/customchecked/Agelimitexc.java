package com.capgemini.checkedexception.customchecked;

public class Agelimitexc extends Exception {
String msg="age should not be more than 18";

public Agelimitexc() {
	super();
}

public Agelimitexc(String msg) {
	super();
this.msg = msg;
}

public String getMessage()
{
	return this.msg;
}

}
