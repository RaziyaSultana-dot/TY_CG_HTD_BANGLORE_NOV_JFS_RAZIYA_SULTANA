package com.capgemini.retailermaintenance.dao;

import java.util.List;

import com.capgemini.retailermaintenance.dto.UserInfo;
import com.capgemini.retailermaintenance.exceptions.UserNotFoundException;

public interface UserInfoDao {
	public boolean createProfile(UserInfo user) throws UserNotFoundException  ;
	public boolean deleteProfile(String id) throws UserNotFoundException;
	public UserInfo login(String email, String password) throws UserNotFoundException;
    public boolean modifyPassword(String id , String password ) throws UserNotFoundException ;
    
}
