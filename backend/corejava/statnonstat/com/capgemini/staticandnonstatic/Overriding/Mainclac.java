package com.capgemini.staticandnonstatic.Overriding;

public class Mainclac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caluclator c=new Caluclator();
		int r1=c.add(12);
		int r2=c.add(50, 25);
		double r3=c.add(30);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		double rs=Caluclator.multiply(30,56.3);
		System.out.println(rs);
		

	}

}
