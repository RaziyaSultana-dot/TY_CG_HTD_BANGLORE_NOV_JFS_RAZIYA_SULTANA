package com.capgemini.retailermaintenance.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import org.springframework.stereotype.Repository;
import com.capgemini.retailermaintenance.dto.OrderInfo;
import com.capgemini.retailermaintenance.exceptions.IdNotFoundException;

@Repository
public class OrderInfoDaoImpl implements OrderInfoDao {

	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public List<OrderInfo> retrieveorder(String id) throws IdNotFoundException {
		List<OrderInfo> list1 = new ArrayList<OrderInfo>();
		EntityManager entityManager = null;    
		try{
			EntityManager manager=factory.createEntityManager();
			OrderInfo  order = entityManager.find(OrderInfo.class,id);

		}catch(Exception e){
			e.printStackTrace();
		}                
		return list1;
	}
}








