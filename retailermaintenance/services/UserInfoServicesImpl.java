package com.capgemini.retailermaintenance.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailermaintenance.dao.UserInfoDao;
import com.capgemini.retailermaintenance.dto.UserInfo;
import com.capgemini.retailermaintenance.exceptions.UserNotFoundException;
@Service
public class UserInfoServicesImpl implements UserInfoServices{

	@Autowired
	private UserInfoDao user;
	
	@Override
	public boolean createProfile(UserInfo user) throws UserNotFoundException {
		
		return createProfile(user);
	}

	@Override
	public boolean deleteProfile(String id) throws UserNotFoundException {// TODO Auto-generated method stub
		return deleteProfile(id);
	}

	@Override
	public UserInfo login(String email, String password) throws UserNotFoundException {
		
		return login(email, password);
	}

	@Override
	public boolean modifyPassword(String id, String password) throws UserNotFoundException {
		
		return modifyPassword(id, password);
	}

}
