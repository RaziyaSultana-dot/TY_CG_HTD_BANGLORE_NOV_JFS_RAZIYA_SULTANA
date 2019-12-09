package com.cap.jdbc;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn =null;
		PreparedStatement pstmt=null;
		try {
        //Load the Driver
		Driver driver=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(driver);
		System.out.println("driver loaded...");
		
		//get DB connection
        String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
        System.out.println("enter db user and password");
        String user =sc.nextLine();
        String password =sc.nextLine();
        conn=DriverManager.getConnection(dbUrl,user,password);
        System.out.println("connection established....");
        
        //issue SQL query
        String query =" INSERT INTO USERS_INFO VALUES(?,?,?,?)";
        pstmt =conn.prepareStatement(query);
        System.out.println("enter user id");
        pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
        System.out.println("enter username");
        pstmt.setString(2, sc.nextLine());
        System.out.println("enter ename");
        pstmt.setString(3, sc.nextLine());
        System.out.println("enter password");
        pstmt.setString(4, sc.nextLine());
        
        
        
        int count=pstmt.executeUpdate();
        if(count >0) {
        	System.out.println("user data inserted...");
        }else {
        	System.out.println("something went wrong...");
        }
        
        
        
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		//process the results
		//close all JDBC objects
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
	
