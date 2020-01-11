package com.capgemini.retailermaintenance.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OrderInfo ")
public class OrderInfo  {
	@Id
	@GeneratedValue
	@Column
	private String id;
	@Column
	private String productid;
	@Column
	private String userid;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "OrderInfo [id=" + id + ", productid=" + productid + ", userid=" + userid + "]";
	}



}