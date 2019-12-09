package com.capgemini.objectclass.objcls;

public class Testemplyeee1 {

	public static void main(String[] args) {
		Employeee1 e1=new Employeee1(111,"shannu");
		Employeee1 e2=new Employeee1(111,"shannu");
		Employeee1 e3=new Employeee1(11,"shannu");

	System.out.println(e1.equals(e2));
	System.out.println(e2.hashCode());
	System.out.println(e1.hashCode());
	System.out.println(e3.hashCode());


	}

}
