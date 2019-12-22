package com.capgemini.flipkart.productservices;

import java.util.List;

import com.capgemini.flipkart.productbeans.ProductBean;
import com.capgemini.flipkart.productdao.ProductDaoImpl;

public class ProductServicesImpl implements ProductServices {
	ProductDaoImpl dao=new ProductDaoImpl();


	@Override
	public List<ProductBean> showAllProducts() {
		return dao.showAllProducts();
		
	}//sa

	@Override
	public List<ProductBean> searchProduct(String name) {

		
		return dao.searchProduct(name);//sp
	}//sp

}
