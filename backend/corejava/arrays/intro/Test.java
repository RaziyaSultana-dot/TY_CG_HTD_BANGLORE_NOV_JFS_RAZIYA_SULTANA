package com.capgemini.arrays.intro;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException a) {
		System.out.println("dont deal with 0");
		}
		finally {
			System.out.println("finally block is called");
		}
		System.out.println("main ended");

	}

}
