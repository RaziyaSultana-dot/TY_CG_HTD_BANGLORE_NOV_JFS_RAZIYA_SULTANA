package com.capgemini.flipkart.productservices;

import java.util.List;

import com.capgemini.flipkart.productbeans.ProductBean;

public interface ProductServices {
	public List<ProductBean> showAllProducts();
	public  List<ProductBean>  searchProduct(String name);
	

}
