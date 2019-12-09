package com.capgemini.threadscreating;

public class PVR {
	//synchronized : after completion of exceution on 1 thread only another threads excecution starts
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
