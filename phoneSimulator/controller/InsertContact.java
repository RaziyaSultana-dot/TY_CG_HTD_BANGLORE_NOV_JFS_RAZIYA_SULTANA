package com.capgemini.phoneSimulator.controller;

import java.util.Scanner;

import com.capgemini.phoneSimulator.bean.ContactBean;
import com.capgemini.phoneSimulator.factory.ContactFactory;
import com.capgemini.phoneSimulator.services.Services;

public class InsertContact {
	public static void main(String[] args) {
		Services services = ContactFactory.instanceOfServices();
		ContactBean contact = new ContactBean();
		Scanner sc = new Scanner(System.in);
		System.out.println("enternumber....");
		contact.setNumber(Integer.parseInt(sc.nextLine()));
		System.out.println("enter  name");
		contact.setName(sc.nextLine());
		System.out.println("enter group");
		contact.setGroup(sc.nextLine());
		
		if(services.insertUser(contact)) {
			System.out.println("user inserted");
		}else {
			
			System.out.println("something went wrong");
		}
		sc.close();
	}
	}


