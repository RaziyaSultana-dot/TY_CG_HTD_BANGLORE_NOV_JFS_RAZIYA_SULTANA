package com.capgemini.phoneSimulator.dao;

import java.util.List;

import com.capgemini.phoneSimulator.bean.ContactBean;

public interface ContactDao {
	public List<ContactBean>getAllContacts();
	public ContactBean usersearch(String name);
	//public boolean operatecontact(ContactBean contact);
	public boolean updateUser(String name,int number,String group);
	public boolean deleteUser(String name,int number);
	public boolean insertContact(ContactBean contact);	


}

























//public class UserDAOImpl  implements UserDAO{
//	FileReader reader;
//	Properties prop;
//	UserBean user;
//
//	public UserDAOImpl() {
//		try {
//
//			reader = new FileReader("db.properties");
//			prop = new Properties();
//			prop.load(reader);
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	public List<UserBean> getAllUsers() {
//		List<UserBean> list = new ArrayList<UserBean>();
//		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
//				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
//				Statement stmt = conn.createStatement();
//				ResultSet rs = stmt.executeQuery(prop.getProperty("query1"))){
//			while(rs.next()) {
//				user = new UserBean();	
//				user.setUserid(rs.getInt(1));
//				user.setUsername(rs.getString(2));
//				user.setEname(rs.getString(3));
//				user.setPassword(rs.getString(4));
//				list.add(user);
//			}
//			return list;
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	@Override
//	public UserBean userLogin(String username, String password) {
//		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
//				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
//				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("loginQuery"))){
//			pstmt.setString(1, username);
//			pstmt.setString(2, password);
//			ResultSet rs =pstmt.executeQuery();
//
//			while(rs.next()) {
//				user=new UserBean();
//				user.setUserid(rs.getInt(1));
//				user.setUsername(rs.getString(2));
//				user.setEname(rs.getString(3));
//
//			}
//			return user;
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//

//	@Override
//	public boolean updateUser(int userid, String password, String ename) {
//		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
//				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
//				java.sql.PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("updateQuery"))){
//			pstmt.setString(1,ename);
//			pstmt.setInt(2, userid);
//			pstmt.setString(3,password);
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
//	private int ename() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	private String userid() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	private String password() {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public boolean deleteUser(int userid, String password) {
//		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
//				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
//				java.sql.PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("deleteQuery"))){
//
//			pstmt.setInt(1, userid);
//			pstmt.setString(2,password);
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
//
//	@Override
//	public boolean insertUser(UserBean user) {
//		try(Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl"),
//				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
//				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("insertQuery"))){
//			pstmt.setInt(1, user.getUserid());
//			pstmt.setString(2,user.getUsername());
//			pstmt.setString(3, user.getEname());
//			pstmt.setString(4, user.getPassword());
//
//			int count = pstmt.executeUpdate();
//			if(count>0) {
//				return true;
//			}
//		}
//		catch (Exception e){
//			e.printStackTrace();
//		}
//		return false;
//	}
//


//----------------------------------------------------------------
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	while (true) {
//		System.out.println("press 1 to add the customer data");
//		System.out.println("press 2 to delete the customer data");
//		System.out.println("press 3 to modify the customer data");
//		System.out.println("press 4 to get customer  data");
//		System.out.println("press 5 to get customerlist ");
//
//
//
//		CustomerDao dao =CustomerDaoManager.getCustomerDao();
//
//		int choice = sc.nextInt();
//		switch(choice) {
//
//		case 1:
//			System.out.println("enter customer no");
//			int customerid =sc.nextInt();
//			System.out.println("enter customer name");
//			String customername = sc.next();
//			System.out.println("enter address 1");
//			String address1 = sc.next();
//			System.out.println("enter address 2");
//			String address2 = sc.next();
//			System.out.println("enter town");
//			String town = sc.next();
//			System.out.println("enter postal code");
//			int postalcode =sc.nextInt();
//			System.out.println("enter email address");
//			String email = sc.next();
//			System.out.println("enter telno code");
//			int telno =sc.nextInt();
//
//			CustomerBean customer = new CustomerBean();
//			customer.setCustomerid(customerid);
//			customer.setCustomername(customername);
//			customer.setAddress1(address1);
//			customer.setAdress2(address2);
//			customer.setTown(town);
//			customer.setPostalcode(postalcode);
//			customer.setEmail(email);
//			customer.setTelno(telno);
//
//			boolean check = dao.addCustomer(customer);
//			if(check) {
//				System.out.println("customer is added...");
//			}
//			else
//				System.out.println("Id repeated...please verify");
//
//			break;
//
//		case 2:
//			System.out.println("enter customer id to delete");
//			int customerid1 =sc.nextInt();
//			CustomerBean customer1 = new CustomerBean();
//			customer1.setCustomerid(customerid1);
//			boolean check1 = dao.deleteCustomer(customer1.getCustomerid());
//			if(check1) {
//				System.out.println("customer is deleted...");
//			}
//			else
//				System.out.println("Id not found to delete...please verify");
//
//			break;
//
//		case 3:
//			break;
//
//		case 4:
//
//			break;
//
//		case 5:
//			System.out.println("customer records");
//			List<CustomerBean> list =dao.getAllCustomers();
//			if(list != null) {
//				for(CustomerBean customerBean : list) {
//					System.out.println(customerBean);
//				}
//			}
//
//			break;
//
//
//		}
//
//
//	}
//}
//
//}
//
////
