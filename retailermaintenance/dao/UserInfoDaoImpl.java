package com.capgemini.retailermaintenance.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.capgemini.retailermaintenance.dto.UserInfo;
import com.capgemini.retailermaintenance.exceptions.UserNotFoundException;
@Repository
public class UserInfoDaoImpl implements UserInfoDao {

	@PersistenceUnit
	EntityManagerFactory factory;


	@Override
	public boolean createProfile(UserInfo user) throws UserNotFoundException {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(user);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}	


	@Override
	public boolean deleteProfile(String id) throws UserNotFoundException {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		UserInfo user = manager.find(UserInfo.class, id);
		if(user!=null) {
			transaction.begin();
			manager.remove(user);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}


	@Override
	public UserInfo login(String email, String password) throws UserNotFoundException {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		UserInfo user = manager.find(UserInfo.class, email);
		user.getEmail();
		user.getPassword();
		manager.close();

		return user;


	}


	@Override
	public boolean modifyPassword(String id, String password) throws UserNotFoundException {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		UserInfo user = manager.find(UserInfo.class, id);
		user.setPassword(password);;
		transaction.commit();
		manager.close();
		return false;
	}




}
