package com.capgemini.flipkart.productApp;

import java.util.List;
import java.util.Scanner;

import com.capgemini.flipkart.factory.ProductFactory;
import com.capgemini.flipkart.productbeans.ProductBean;
import com.capgemini.flipkart.productdao.ProductDao;
import com.capgemini.flipkart.productservices.ProductServices;

public class MainApp {
	public static void main(String[] args) {

		ProductBean product=new ProductBean();
		ProductServices service=ProductFactory.instanceOfProductServicesImpl();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Press 1 to show all products");
			System.out.println("press 2 to search for product");
			

			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				List<ProductBean> list=service.showAllProducts();
				if(list!=null){
					for(ProductBean prod :list){
						System.out.println(prod);
					}
				}
				break;
			case 2:
				System.out.println("Enter the product name");
				String name=sc.next();

				List<ProductBean> list1=service.searchProduct(name);
								if(list1!=null){
									for(ProductBean product1:list1){
									System.out.println(product1.getProductId());
									System.out.println(product1.getNumberOfProducts());
									System.out.println(product1.getProductName());
									System.out.println(product1.getDescription());
									System.out.println(product1.getProductCatogery());
									System.out.println(product1.getProductCost());
									}
								}
								else{
									System.out.println("PRODUCT does not exit");
								}
				ProductInfo.main(args);

						
					}
				}

			}
}

