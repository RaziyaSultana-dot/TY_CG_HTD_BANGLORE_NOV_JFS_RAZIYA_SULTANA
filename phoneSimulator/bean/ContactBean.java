package com.capgemini.phoneSimulator.bean;

public class ContactBean {
	private int number;
	private String name;
	private String group;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	@Override
	public String toString() {
		return "UserBean [number=" + number + ", name=" + name + ", group=" + group + "]";
	}
	
	
	

}
