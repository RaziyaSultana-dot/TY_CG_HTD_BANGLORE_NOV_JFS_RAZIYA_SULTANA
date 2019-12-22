package com.capgemini.flipkart.productdao;

import java.util.List;

import com.capgemini.flipkart.productbeans.ProductBean;

public interface ProductDao {
	public List<ProductBean> showAllProducts();
	public  List<ProductBean>  searchProduct(String name);
	
}
