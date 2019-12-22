package com.capgemini.flipkart.factory;

import com.capgemini.flipkart.productdao.ProductDao;
import com.capgemini.flipkart.productdao.ProductDaoImpl;
import com.capgemini.flipkart.productservices.ProductServices;
import com.capgemini.flipkart.productservices.ProductServicesImpl;

public class ProductFactory {
	public static ProductDao instanceOfProductDaoImpl(){
		ProductDao dao=new ProductDaoImpl();
		return dao;
	}

	public static ProductServices instanceOfProductServicesImpl(){
		ProductServices service=new ProductServicesImpl();
		return service;
	}
}


