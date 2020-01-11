package com.capgemini.retailermaintenance.services;

import java.util.List;

import com.capgemini.retailermaintenance.dto.ProductInfo;

public interface ProductInfoServices {
	
	public boolean addProductinfo(ProductInfo product);

	public List<ProductInfo>  getProduct(String id);

	public List<ProductInfo> getAllProducts();


}
