package com.capgemini.checkedexception.exceppropch;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		try {
			B.m();
			System.out.println("handled");
		}
			
			catch(ClassNotFoundException c) {
				System.out.println("class not handled in A");
			}
		System.out.println("main-the end");
		}
	}


