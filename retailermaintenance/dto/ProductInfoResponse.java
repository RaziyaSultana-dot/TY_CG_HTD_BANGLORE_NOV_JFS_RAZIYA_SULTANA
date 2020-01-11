package com.capgemini.retailermaintenance.dto;

import java.util.List;

public class ProductInfoResponse {
	private int statusacode;
	private String message;
	private String discription;
	private List<ProductInfo> beans;
	public int getStatusacode() {
		return statusacode;
	}
	public void setStatusacode(int statusacode) {
		this.statusacode = statusacode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public List<ProductInfo> getBeans() {
		return beans;
	}
	public void setBeans(List<ProductInfo> product) {
		this.beans = product;
	}
	
	
	

}



