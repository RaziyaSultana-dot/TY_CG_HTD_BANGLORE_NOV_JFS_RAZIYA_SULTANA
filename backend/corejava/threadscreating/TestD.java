package com.capgemini.threadscreating;

public class TestD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		IRCTC i=new IRCTC();
		Useri u1=new Useri(i);
		u1.start();
		
		
		Useri u2=new Useri(i);
		u2.start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main ended");
		
		

	}

}
