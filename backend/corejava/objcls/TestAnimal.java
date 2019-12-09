package com.capgemini.objectclass.objcls;

public class TestAnimal {

	public static void main(String[] args) throws  ClassNotFoundException
	{ 
		// TODO Auto-generated method stub
		Dog d1=new Dog("pinky");
		Class<? extends Dog> c1=d1.getClass();
		Class c2=Class.forName("Dog");
		System.out.println(c2);

	}
}
