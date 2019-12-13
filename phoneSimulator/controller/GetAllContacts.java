package com.capgemini.phoneSimulator.controller;

import java.util.List;

import com.capgemini.phoneSimulator.bean.ContactBean;
import com.capgemini.phoneSimulator.factory.ContactFactory;
import com.capgemini.phoneSimulator.services.Services;

public class GetAllContacts {
	public static void main(String[] args) {
		Services services =ContactFactory.instanceOfServices();

		List <ContactBean> list = services.getAllContacts();

		if(list !=null) {
			for(ContactBean contact : list) {
				System.out.println(contact);
			}
		}
	}

}



