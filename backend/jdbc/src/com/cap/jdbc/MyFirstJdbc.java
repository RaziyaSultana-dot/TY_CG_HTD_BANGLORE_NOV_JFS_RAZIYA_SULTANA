
package com.cap.jdbc;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJdbc {
	public static void main(String[] args) {
		
	  Connection conn=null;
	  Statement stmt=null;
	  ResultSet rs=null;

	
	  
		
		try {
			//load the driver
//		Driver driver = new com.mysql.jdbc.Driver();
//		DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");

		System.out.println("driver loaded...vb");

		//get DB connection via driver
		String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6" + "?user=root&password=root";
		conn = DriverManager.getConnection(dbUrl);
		//drivermanager-class
		System.out.println("connection established...");
		
		//issue sql query...
		String query="select * from users_info";
		stmt = conn.createStatement();
		rs= stmt.executeQuery(query);
		System.out.println("result issued");
		
		//process the result returned
		while(rs.next()) {
			System.out.println("userid:"+rs.getInt("userid"));
			System.out.println("username"+rs.getString("username"));
			System.out.println("ename"+rs.getString("ename"));
			System.out.println("********p**********************************");
		}
//	}catch (SQLException e) {
	}catch (Exception e) {

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
				if(stmt !=null) 
					stmt.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		

}
}


	