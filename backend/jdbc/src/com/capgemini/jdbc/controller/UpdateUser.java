package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class UpdateUser {

	//	public boolean updateUser(int userid, String password, String ename) {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserServices services = UserFactory.instanceOfUserServices();
		UserBean user = new UserBean();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Userid....");
		user.setUserid(Integer.parseInt(sc.nextLine()));
		
		System.out.println("enter password");
		user.setPassword(sc.nextLine());
		System.out.println("enter ename");
		user.setEname(sc.nextLine());
		
boolean result = services.updateUser(user.getUserid(),user.getPassword(),user.getEname());
		
		if(result) {
			System.out.println("updated");
		}
		else {
			System.out.println("cant b updated");
		}
		
		
		
		
		
	}

}
