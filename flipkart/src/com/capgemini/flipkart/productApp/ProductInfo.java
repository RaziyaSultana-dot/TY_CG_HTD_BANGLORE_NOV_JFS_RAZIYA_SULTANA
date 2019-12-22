package com.capgemini.flipkart.productApp;

import java.util.List;
import java.util.Scanner;

import com.capgemini.flipkart.factory.ProductFactory;
import com.capgemini.flipkart.productbeans.ProductBean;
import com.capgemini.flipkart.productservices.ProductServices;

public class ProductInfo {
	public static void main(String[] args) {
		ProductBean product=new ProductBean();
		ProductServices service=ProductFactory.instanceOfProductServicesImpl();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("press 1 to buy");
			System.out.println("press 2 to search again");
			System.out.println("press 3 to go back to main menu");
			int ch=sc.nextInt();
			switch(ch){
			case 1:
				
				System.out.println("please enter your card number");
				String num=sc.next();
				
				System.out.println("enter your CVV");
				String cvv=sc.next();
				
				System.out.println("transaction being processed");
				System.out.println("your order has been placed...visit agin");
				
				break;
			case 2:
				System.out.println("search again...!!!!");
				System.out.println("Enter the product name");
				String name=sc.next();

				List<ProductBean> list1=service.searchProduct(name);
								if(product!=null){
									System.out.println(product.getProductId());
									System.out.println(product.getProductName());
									System.out.println(product.getProductCost());
									System.out.println(product.getProductCatogery());
									System.out.println(product.getDescription());
									System.out.println(product.getNumberOfProducts());
								}
								else{
									System.out.println("product does not exit");
								}
				ProductInfo.main(args);

				

				ProductInfo.main(args);

				break;
			case 3:
				MainApp.main(args);
				break;
			}
		}


	}

}
	