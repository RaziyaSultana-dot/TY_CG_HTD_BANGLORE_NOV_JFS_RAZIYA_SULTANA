package com.capgemini.flipkart.productdao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.flipkart.productbeans.ProductBean;

public class ProductDaoImpl implements ProductDao{
	FileReader reader;
	Properties prop;
	ProductBean product;

	public ProductDaoImpl()
	{
		try {
			reader=new FileReader("db.properties.txt");
			prop=new Properties();
			prop.load(reader);
			product=new ProductBean();
			Class.forName(prop.getProperty("driverClass"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<ProductBean> showAllProducts() {

		List<ProductBean> list=new ArrayList<ProductBean>();
		try(	Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"));)
		{
			while(rs.next())	
			{
				product=new ProductBean();

				product.setProductId(rs.getInt(1));
				product.setProductName(rs.getString(2));
				product.setProductCost(rs.getDouble(3));
				product.setProductCatogery(rs.getString(4));
				product.setDescription(rs.getString(5));
				product.setNumberOfProducts(rs.getInt(6));

				list.add(product);
			}
			return list; 
		}catch(Exception e)		{
			e.printStackTrace();
		}

		return null;//sa
	}//sa

	@Override
	public List<ProductBean> searchProduct(String name) {
		List<ProductBean> list1 = new ArrayList<ProductBean>();
		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
		
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("searchQuery"))
				


				){
			
			pstmt.setString(1, name);
			
			
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				ProductBean	product =  new ProductBean();
				product.setProductId(rs.getInt(1));
				product.setProductName(rs.getString(2));
				product.setProductCost(rs.getDouble(3));
				product.setProductCatogery(rs.getString(4));
				product.setDescription(rs.getString(5));
				product.setNumberOfProducts(rs.getInt(6));

				list1.add(product);
			}
			return list1;

		}catch(Exception e)
		{
			e.printStackTrace();

		}
		
		
		
		
		
		return null;
	}
	}//sp




