package com.capgemini.retailermaintenance.dao;

import java.util.List;

import com.capgemini.retailermaintenance.dto.ProductInfo;

public interface ProductInfoDao {

	public boolean addProductinfo(ProductInfo product);

	public ProductInfo  getProduct(int id);

	public List<ProductInfo> getAllProducts();




}
