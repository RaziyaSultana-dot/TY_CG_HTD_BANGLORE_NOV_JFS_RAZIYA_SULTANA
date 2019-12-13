package com.capgemini.phoneSimulator.factory;

import com.capgemini.phoneSimulator.dao.ContactDao;
import com.capgemini.phoneSimulator.dao.ContactDaoImpl;
import com.capgemini.phoneSimulator.dao.ContactOperations;
import com.capgemini.phoneSimulator.services.Services;
import com.capgemini.phoneSimulator.services.ServicesImpl;

public class ContactFactory {
private ContactFactory(){
		
	}
	public static ContactDao instanceOfContactDaoImpl() {
		
		ContactDao dao= new ContactDaoImpl();
		return dao;
	}
	public static Services instanceOfServices() {
		Services services = new ServicesImpl();
		return services;
	}
	
	
}


