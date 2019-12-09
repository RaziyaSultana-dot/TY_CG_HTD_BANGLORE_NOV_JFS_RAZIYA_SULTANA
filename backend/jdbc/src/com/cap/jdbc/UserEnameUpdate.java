package com.cap.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEnameUpdate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn =null;
		PreparedStatement pstmt=null;
		try {
			//Load the Driver
			//			Driver driver=new com.mysql.jdbc.Driver();
			//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded...");

			//get DB connection
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("enter db user and password");
			String user =sc.nextLine();
			String password =sc.nextLine();
			conn=DriverManager.getConnection(dbUrl,user,password);
			System.out.println("connection established....");

			//issue SQL queries

			String query ="update users_info set ename=?"
					+"where userid=?  and password=?";

			pstmt=conn.prepareStatement(query);

			System.out.println("enter userid...");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));

			System.out.println("enter ename to update");
			pstmt.setString(2, sc.nextLine());	        

			System.out.println("enter password");
			pstmt.setString(3, sc.nextLine());

			int count=pstmt.executeUpdate();
			System.out.println("query issued");

			//Process the results returned
			if(count > 0) {
				System.out.println("Query ok,"+count+"rows effected");
			}else {
				System.err.println("something went wrong...");
			}

			sc.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//close all the JDBC objects

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
