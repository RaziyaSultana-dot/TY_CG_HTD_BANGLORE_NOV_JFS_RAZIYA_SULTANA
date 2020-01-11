package com.capgemini.retailermaintenance.dto;

import java.util.List;



public class UserInfoResponse {
	private int statusacode;
	private String message;
	private String discription;
	private List<UserInfo> beans;
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
	public List<UserInfo> getBeans() {
		return beans;
	}
	public void setBeans(List<UserInfo> beans) {
		this.beans = beans;
	}
	
	

}
