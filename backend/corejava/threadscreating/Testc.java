package com.capgemini.threadscreating;

public class Testc {

	public static void main(String[] args) {

		System.out.println("main started");
		
		PVR p=new PVR();
		User u= new User(p);
		u.start();
		p.leaveMe();

		System.out.println("main ended");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
