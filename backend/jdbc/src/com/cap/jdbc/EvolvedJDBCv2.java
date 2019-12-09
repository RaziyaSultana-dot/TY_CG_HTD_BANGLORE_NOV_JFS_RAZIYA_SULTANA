package com.cap.jdbc;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class EvolvedJDBCv2 {

	public static void main(String[] args) {
		FileReader reader=null;
		Properties prop = null;
		//ResultSet rs= null;
		try {
			reader = new FileReader( "db.properties");
			prop =new Properties();
			prop.load(reader);

			Class.forName(prop.getProperty("driverclass"));
			System.out.println("driver loaded");


		} catch (Exception e) {
//			e.printStackTrace();
		}

		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"), prop.getProperty("dbPassword"));

			Statement stmt =conn.createStatement();
			ResultSet rs = stmt.executeQuery(prop.getProperty("query1"))){
				while(rs.next()) {
					System.out.println("userid:" + rs.getInt(1));
					System.out.println("username:" + rs.getString("username"));
					System.out.println("ename:" + rs.getString("ename"));
					System.out.println("***************************************************");
				}

			}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}