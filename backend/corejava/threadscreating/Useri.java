package com.capgemini.threadscreating;

public class Useri extends Thread {
	
	IRCTC i;
	
	public Useri(IRCTC i) {
		
		this.i = i;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		i.confirmTicket();
	}
	

}
