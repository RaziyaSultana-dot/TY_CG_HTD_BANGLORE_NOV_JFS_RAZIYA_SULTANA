package com.capgemini.staticandnonstatic.staticnon;

public class Testqspi {
	public static void main(String [] args)
	{
		Qspiders hebbal=new Qspiders();
		hebbal.swipe();
		hebbal.swipe();
		
		Qspiders btm=new Qspiders();
		btm.swipe();
		btm.swipe();
		btm.swipe();
		
		System.out.println(Qspiders.totalstu);
		System.out.println(hebbal.branchstu);
		System.out.println(btm.branchstu);

		
	}

}
