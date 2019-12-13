package com.capgemini.phoneSimulator.services;

import java.util.List;

import com.capgemini.phoneSimulator.bean.ContactBean;

public interface Services {
	
	public List<ContactBean>getAllContacts();
	public ContactBean usersearch(String name);
	//public boolean operatecontact(ContactBean contact);
	public boolean updateUser(String name,int number,String group);
	public boolean deleteUser(String name,int number);
	public boolean insertUser(ContactBean user);	


}
