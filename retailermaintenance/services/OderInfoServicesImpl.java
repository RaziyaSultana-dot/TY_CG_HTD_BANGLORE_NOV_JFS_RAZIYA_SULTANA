package com.capgemini.retailermaintenance.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailermaintenance.dao.OrderInfoDao;
import com.capgemini.retailermaintenance.dto.OrderInfo;
import com.capgemini.retailermaintenance.exceptions.IdNotFoundException;
@Service
public class OderInfoServicesImpl implements OrderInfoServices{
	@Autowired
	private OrderInfoDao order;
	
	@Override
	public List<OrderInfo> retrieveorder(String id) throws IdNotFoundException {
	
		return  order.retrieveorder(id);
	}

}
