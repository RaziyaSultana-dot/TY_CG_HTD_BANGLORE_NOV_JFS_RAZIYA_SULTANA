package com.capgemini.threadscreating;

public class IRCTC {

	synchronized void confirmTicket() {
		for(int i=0;i<4;i++) {
			System.out.println(i);
			
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	synchronized void leaveMe() {
		System.out.println("notify called");
		notify();
	}

}