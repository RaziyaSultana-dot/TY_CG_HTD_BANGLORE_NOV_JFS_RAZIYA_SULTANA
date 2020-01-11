package com.capgemini.retailermaintenance.services;

import java.util.List;

import com.capgemini.retailermaintenance.dto.OrderInfo;
import com.capgemini.retailermaintenance.exceptions.IdNotFoundException;

public interface OrderInfoServices {
	public List<OrderInfo> retrieveorder(String id) throws  IdNotFoundException;


}
