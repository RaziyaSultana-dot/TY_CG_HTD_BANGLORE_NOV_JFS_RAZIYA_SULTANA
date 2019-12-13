package com.capgemini.phoneSimulator.controller;

import java.util.Scanner;

import com.capgemini.phoneSimulator.bean.ContactBean;
import com.capgemini.phoneSimulator.factory.ContactFactory;
import com.capgemini.phoneSimulator.services.Services;

public class DeleteContact {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Services services = ContactFactory.instanceOfServices();
		ContactBean contact = new ContactBean();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name....");
		contact.setName(sc.nextLine());
		

		System.out.println("enter number");
		
		contact.setNumber(Integer.parseInt(sc.nextLine()));
		

boolean result = services.deleteUser(contact.getName(),contact.getNumber() );
		
		if(result) {
			System.out.println("deleted");
		}
		else {
			System.out.println("unable to delete");
		}
		
		
		
		
		
	}

}



