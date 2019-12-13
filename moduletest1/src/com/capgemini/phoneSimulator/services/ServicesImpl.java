package com.capgemini.phoneSimulator.services;

import java.util.List;

import com.capgemini.phoneSimulator.bean.ContactBean;
import com.capgemini.phoneSimulator.dao.ContactDao;
import com.capgemini.phoneSimulator.factory.ContactFactory;

public class ServicesImpl implements Services {

	ContactDao dao = ContactFactory.instanceOfContactDaoImpl();

	@Override
	public List<ContactBean> getAllContacts() {
		
		
		return dao.getAllContacts();
	}

	@Override
	public ContactBean usersearch(String name) {
		// TODO Auto-generated method stub
		return dao.usersearch(name);
	}

//	@Override
//	public boolean operatecontact(ContactBean contact) {
//		// TODO Auto-generated method stub
//		return dao.operatecontact(contact);
//	}

	@Override
	public boolean updateUser(String name, int number, String group) {
		// TODO Auto-generated method stub
		return dao.updateUser(name, number, group);
	}

	@Override
	public boolean deleteUser(String name, int number) {
		// TODO Auto-generated method stub
		return dao.deleteUser(name, number);
	}

	@Override
	public boolean insertUser(ContactBean contact) {
		// TODO Auto-generated method stub
		return dao.insertContact(contact);
	}

}
