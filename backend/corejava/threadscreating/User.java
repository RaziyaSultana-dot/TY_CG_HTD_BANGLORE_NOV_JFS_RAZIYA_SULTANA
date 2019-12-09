package com.capgemini.threadscreating;

public class User extends Thread {
	PVR p;

	public User(PVR p) {
		
		this.p = p;
	}
	
	public void run() {
		p.confirmTicket();
	}

}
