package com.capgemini.retailermaintenance.dao;

import java.util.List;


import com.capgemini.retailermaintenance.dto.OrderInfo;
import com.capgemini.retailermaintenance.exceptions.IdNotFoundException;

public interface OrderInfoDao {

	public List<OrderInfo> retrieveorder(String id) throws  IdNotFoundException;



}
