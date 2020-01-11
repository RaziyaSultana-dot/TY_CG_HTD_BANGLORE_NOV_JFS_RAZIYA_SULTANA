package com.capgemini.retailermaintenance.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.retailermaintenance.dto.ProductInfo;
import com.capgemini.retailermaintenance.dao.ProductInfoDao;

@Service
public class ProductInfoServicesImpl implements ProductInfoServices{
	
@Autowired
private ProductInfoDao product;


@Override
public List<ProductInfo> getAllProducts() {
	
	return product.getAllProducts();
}

@Override
public boolean addProductinfo(ProductInfo product) {
	
	return addProductinfo(product);
}

@Override
public List<ProductInfo> getProduct(String id) {
	
	return product.getProduct(id);
}



}



