package com.capgemini.phoneSimulator.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.phoneSimulator.bean.ContactBean;
import com.capgemini.phoneSimulator.factory.ContactFactory;

public class ContactDaoImpl implements ContactDao {
	FileReader reader;
	Properties prop;
	ContactBean contact;

	public ContactDaoImpl() {
		try {

			reader = new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//ContactDao dao = ContactFactory.instanceOfContactOperations();


	@Override
	public List<ContactBean> getAllContacts() {
		List<ContactBean> list = new ArrayList<ContactBean>();
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next()) {
				contact = new ContactBean();	
		contact.setName(rs.getString(1));
				contact.setNumber(rs.getInt(2));
				contact.setGroup(rs.getString(3));
				list.add(contact);
			}
			return list;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
		
	
	@Override
	public ContactBean usersearch(String name) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("seacrchQuery"))){
			pstmt.setString(1,name);
			
			ResultSet rs =pstmt.executeQuery();

			while(rs.next()) {
				contact=new ContactBean();
				contact.setName(rs.getString(1));
				contact.setNumber(rs.getInt(2));
				contact.setGroup(rs.getString(3));
			
			}
			return contact;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	
	public boolean updateUser(String name, int number, String group) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				java.sql.PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("updateQuery"))){
			pstmt.setString(1,name);
			pstmt.setInt(2, number);
			pstmt.setString(3,group);

			int count=pstmt.executeUpdate();
			if(count > 0) {
				return true;
			}else {
				return false;
			}


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	

	@Override
	public boolean deleteUser(String name, int number) {
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				java.sql.PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deleteQuery"))){

			pstmt.setString(1, name);
			pstmt.setInt(2,number);

			int count=pstmt.executeUpdate();
			if(count > 0) {
				return true;
			}else {
				return false;
			}


		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return false;
	}

	@Override
		public boolean insertContact(ContactBean contact) {
			try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
						prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
						PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("insertQuery"))){
					pstmt.setInt(1, contact.getNumber());
					pstmt.setString(2,contact.getName());
					pstmt.setString(3, contact.getGroup());

					int count = pstmt.executeUpdate();
					if(count>0) {
						return true;
					}
				}
				catch (Exception e){
					e.printStackTrace();
				}
				return false;
			}

	
	}


		


		
		
	