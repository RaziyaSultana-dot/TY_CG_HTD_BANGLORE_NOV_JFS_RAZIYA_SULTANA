package com.capgemini.phoneSimulator.controller;

import java.util.Scanner;

import com.capgemini.phoneSimulator.bean.ContactBean;
import com.capgemini.phoneSimulator.factory.ContactFactory;
import com.capgemini.phoneSimulator.services.Services;

public class UpdateContact {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Services services = ContactFactory.instanceOfServices();
		ContactBean contact = new ContactBean();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Userid....");
		contact.setNumber(Integer.parseInt(sc.nextLine()));
		
		System.out.println("enter password");
		contact.setName(sc.nextLine());
		System.out.println("enter ename");
		contact.setGroup(sc.nextLine());
		
boolean result = services.updateUser(contact.getName(),contact.getNumber(),contact.getGroup());
		
		if(result) {
			System.out.println("updated");
		}
		else {
			System.out.println("cant b updated");
		}
		
		
		
		
		
	}

}



