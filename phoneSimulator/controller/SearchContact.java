package com.capgemini.phoneSimulator.controller;

import java.util.Scanner;

import com.capgemini.phoneSimulator.bean.ContactBean;
import com.capgemini.phoneSimulator.factory.ContactFactory;
import com.capgemini.phoneSimulator.services.Services;

public class SearchContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Services services = ContactFactory.instanceOfServices();
		ContactBean contact = new ContactBean();
		Scanner sc = new Scanner(System.in);
		System.out.println("entername");
		contact.setName(sc.nextLine());
		
		ContactBean contact1 = services.usersearch(contact.getName() );
		
		if(contact1 != null) {
			System.out.println("name is"+contact1.getName());
			System.out.println("number is"+contact1.getNumber());
			System.out.println("group is"+contact1.getGroup());
		}
		else {
			System.out.println("eneter correct details");
		}
		
		
		
	}

}



