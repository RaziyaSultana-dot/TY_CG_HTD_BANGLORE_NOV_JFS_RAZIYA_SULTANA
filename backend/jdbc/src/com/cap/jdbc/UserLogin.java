package com.cap.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class UserLogin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 Connection conn=null;
		 // Statement stmt=null;
		 PreparedStatement pstmt=null;
		  ResultSet rs=null;
		 
		  
		  try {
				//load the driver
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("driver loaded...vb");

			//get DB connection via driver
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("enter username and password");
			
			String dbUser=sc.nextLine();
			String dbPass=sc.nextLine();
			conn = DriverManager.getConnection(dbUrl,dbUser,dbPass);
			System.out.println("connection established...");
			
			//issue sql query...
			String query="select * from users_info where userid = ? and password = ?";
			pstmt = conn.prepareStatement(query);
			
			System.out.println("enter user id");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			
			System.out.println("enter password");
			pstmt.setString(2,sc.nextLine());
			
			rs= pstmt.executeQuery();
			System.out.println("result issued");
			System.out.println("**************************");

			//process the result returned
			if(rs.next()) {
				System.out.println("userid:"+rs.getInt("userid"));
				System.out.println("username"+rs.getString("username"));
				System.out.println("ename"+rs.getString("ename"));
				System.out.println("********p**********************************");
			}else {
				System.out.println("something went wrong");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		  finally {
				try
				{
				if(conn !=null)
				conn.close();
					
				}catch(SQLException e) {
					e.printStackTrace();
				}

				try {
					if(pstmt !=null) 
						pstmt.close();
					}catch(SQLException e) {
						e.printStackTrace();
					}
				}
			

	}
	}


		