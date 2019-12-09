package com.org.capgem.htd.trainingsec;

public class Testanimal {
public static void main (String [] args)
{
	Animal a=new Animal();
			a.eat();
			System.out.println("-----------------------");
			
			Animal a1=new Dog();
			a1.eat();
System.out.println("-----------------------");
			
			Animal d1=(Dog)a1;
			d1.eat();
		
			
			
				
			
}
}
