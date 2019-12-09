package com.capgemini.threadscreating;

public class TestB {

	public static void main(String[] args) {
		System.out.println(("main started"));
		System.out.println("main starts");
		Thread2 t2=new Thread2();
		
		Thread t = new Thread();
		
		t.start();
		t2.run();
		System.out.println("main ended");
		
		

	}

}
