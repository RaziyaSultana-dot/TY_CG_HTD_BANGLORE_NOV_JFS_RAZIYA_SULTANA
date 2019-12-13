package com.capgemini.phoneSimulator.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import com.capgemini.phoneSimulator.bean.ContactBean;

public class ContactOperations  {
	
	
//	FileReader reader;
//	Properties prop;
//	ContactBean contact;
//
//	public ContactOperations() {
//		try {
//
//			reader = new FileReader("db.properties");
//			prop = new Properties();
//			prop.load(reader);
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (Exception e) {
//			e.printStackTrace();
		}


//	@Override
//	public boolean updateUser(String name, int number, String group) {
//		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
//				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
//				java.sql.PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("updateQuery"))){
//			pstmt.setString(1,name);
//			pstmt.setInt(2, number);
//			pstmt.setString(3,group);
//
//			int count=pstmt.executeUpdate();
//			if(count > 0) {
//				return true;
//			}else {
//				return false;
//			}
//
//
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return false;
//	}
//
//	
//
//	@Override
//	public boolean deleteUser(String name, int number) {
//		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
//				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
//				java.sql.PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deleteQuery"))){
//
//			pstmt.setString(1, name);
//			pstmt.setInt(2,number);
//
//			int count=pstmt.executeUpdate();
//			if(count > 0) {
//				return true;
//			}else {
//				return false;
//			}
//
//
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//			
//		return false;
//	}
//
//	@Override
//		public boolean insertContact(ContactBean contact) {
//			try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
//						prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
//						PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("insertQuery"))){
//					pstmt.setInt(1, contact.getNumber());
//					pstmt.setString(2,contact.getName());
//					pstmt.setString(3, contact.getGroup());
//
//					int count = pstmt.executeUpdate();
//					if(count>0) {
//						return true;
//					}
//				}
//				catch (Exception e){
//					e.printStackTrace();
//				}
//				return false;
//			}
//	}
//
//
//		
//
//
//		
//		
//	