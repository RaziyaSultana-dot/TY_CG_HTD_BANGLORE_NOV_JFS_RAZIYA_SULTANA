package com.capgemini.flipkart.productbeans;

import java.io.Serializable;

public class ProductBean implements Serializable {
	private int ProductId;
	private String ProductName;
	private double ProductCost;
	private String  ProductCatogery;
	private String Description;
	private int NumberOfProducts;
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public double getProductCost() {
		return ProductCost;
	}
	public void setProductCost(double productCost) {
		ProductCost = productCost;
	}
	public String getProductCatogery() {
		return ProductCatogery;
	}
	public void setProductCatogery(String productCatogery) {
		ProductCatogery = productCatogery;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getNumberOfProducts() {
		return NumberOfProducts;
	}
	public void setNumberOfProducts(int numberOfProducts) {
		NumberOfProducts = numberOfProducts;
	}
	@Override
	public String toString() {
		return "ProductBean [ProductId=" + ProductId + ", ProductName=" + ProductName + ", ProductCost=" + ProductCost
				+ ", ProductCatogery=" + ProductCatogery + ", Description=" + Description + ", NumberOfProducts="
				+ NumberOfProducts + "]";
	}
	
	
	

}
