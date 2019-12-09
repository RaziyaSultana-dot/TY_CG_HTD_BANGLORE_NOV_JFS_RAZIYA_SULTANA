package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class UserLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserServices services = UserFactory.instanceOfUserServices();
		
		UserBean user = new UserBean();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user name");
		user.setUsername(sc.nextLine());
		System.out.println("enter user password");
		user.setPassword(sc.nextLine());
		UserBean user1 = services.userLogin(user.getUsername(),user.getPassword() );
		
		if(user1 != null) {
			System.out.println("userid is"+user1.getUserid());
			System.out.println("username is"+user1.getUsername());
			System.out.println("ename is"+user1.getEname());
		}
		else {
			System.out.println("eneter correct details");
		}
		
		
		
	}

}
