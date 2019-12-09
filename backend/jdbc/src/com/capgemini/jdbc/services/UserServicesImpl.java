package com.capgemini.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.dao.UserDAO;
import com.capgemini.jdbc.factory.UserFactory;

public class UserServicesImpl implements UserServices{
	
	UserDAO dao = UserFactory.instanceOfUserDAOImpl();

	@Override
	public List<UserBean> getAllUsers() {
		// TODO Auto-generated method stub
		return dao.getAllUsers();
	}

	@Override
	public UserBean userLogin(String username, String password) {
		// TODO Auto-generated method stub
		return dao.userLogin(username, password);
	}

	@Override
	public boolean updateUser(int userid, String password, String ename) {
		// TODO Auto-generated method stub
		return dao.updateUser(userid, password, ename);
	}

	@Override
	public boolean deleteUser(int userid, String password) {
		// TODO Auto-generated method stub
		return dao.deleteUser(userid, password);
	}

	@Override
	public boolean insertUser(UserBean user) {
		// TODO Auto-generated method stub
		return dao.insertUser(user);
	}

}