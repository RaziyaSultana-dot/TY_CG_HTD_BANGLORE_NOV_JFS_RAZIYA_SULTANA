package com.capgemini.objectclass.objcls;
public class Testperson {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.out.println("-----main started");
		Person p1=new Person("Johnny");
		p1.finalize();
		p1=null;
		System.gc();
		System.out.println("-----main ended");
		
	}

}
