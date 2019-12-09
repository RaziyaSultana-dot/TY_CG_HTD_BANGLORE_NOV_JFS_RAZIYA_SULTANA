package com.capgemini.arrays.intro;

public class Arrayex {

	public static void main(String[] args) {
		int a1[] =new int[2];
		a1[0]=75;
		a1[1]=85;
		
		try
		{
			a1[2]=86;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("no place....bye bye");
		}
		
		
		System.out.println("main ended");
		// TODO Auto-generated method stub

	}

}
