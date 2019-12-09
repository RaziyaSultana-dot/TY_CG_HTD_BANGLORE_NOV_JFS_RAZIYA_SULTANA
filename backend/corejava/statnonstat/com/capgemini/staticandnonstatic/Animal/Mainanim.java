package com.capgemini.staticandnonstatic.Animal;

public class Mainanim {
public static void main(String [] args)
{
	Dog d= new Dog();
	d.bark();
			
	d.eat();
	
	Cat c=new Cat();
	c.eat();
	c.sound();
}
}
