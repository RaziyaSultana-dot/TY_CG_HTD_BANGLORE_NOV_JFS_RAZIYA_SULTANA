package com.capgemini.threads;

import com.capgemini.threadscreating.Thread1;

public class TestA {

	public static void main(String[] args) {
		System.out.println("main starts");
		Thread1 t1=new Thread1();
		t1.start();
		System.out.println("main ended");
		
		
		
	}

	
}
