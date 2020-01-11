package com.capgemini.retailermaintenance.services;

import com.capgemini.retailermaintenance.dto.UserInfo;
import com.capgemini.retailermaintenance.exceptions.UserNotFoundException;

public interface UserInfoServices {
	public boolean createProfile(UserInfo user) throws UserNotFoundException  ;
	public boolean deleteProfile(String id) throws UserNotFoundException;
	public UserInfo login(String email, String password) throws UserNotFoundException;
    public boolean modifyPassword(String id , String password ) throws UserNotFoundException ;

}
