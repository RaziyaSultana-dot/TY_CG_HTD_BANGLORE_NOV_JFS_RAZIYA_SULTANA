package com.capgemini.retailermaintenance.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailermaintenance.dto.OrderInfo;
import com.capgemini.retailermaintenance.dto.OrderInfoResponse;
import com.capgemini.retailermaintenance.dto.ProductInfo;
import com.capgemini.retailermaintenance.dto.ProductInfoResponse;
import com.capgemini.retailermaintenance.exceptions.IdNotFoundException;
import com.capgemini.retailermaintenance.services.OrderInfoServices;
import com.capgemini.retailermaintenance.services.ProductInfoServices;

@RestController
public class RetailerController {

	@Autowired
	ProductInfoServices service;
	
	
	@Autowired
	OrderInfoServices service1;
	
	@PostMapping(path="/addProductInfo",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductInfoResponse addProductInfo(@RequestBody ProductInfo product) throws IdNotFoundException {
		ProductInfoResponse response = new ProductInfoResponse();
		if(service.addProductinfo(product)) {
			response.setStatusacode(201);
			response.setMessage("Success");
			response.setDiscription("product added");
		} else {
			response.setStatusacode(401);
			response.setMessage("Failure");
			response.setDiscription("product with same name already exists");
		}
		return response;
	}
	
	
	@GetMapping(path="/getProduct",produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductInfoResponse searchProduct(@RequestParam("id") String id) throws IdNotFoundException {
		ProductInfoResponse response = new ProductInfoResponse();
		List<ProductInfo> product=service.getProduct(id);
		if(product!=null) {
			response.setStatusacode(201);
			response.setMessage("Success");
			response.setDiscription("product found");
			response.setBeans(product);
		} else {
			response.setStatusacode(401);
			response.setMessage("Failure");
			response.setDiscription("product id does not exist");
		}
		return response;
	}
	
	
	
	@GetMapping(path="/getAllProducts",produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductInfoResponse showCustomers() throws IdNotFoundException {
		ProductInfoResponse response = new ProductInfoResponse();
		List<ProductInfo> list=service.getAllProducts();
		if(list.size()!=0) {
			response.setStatusacode(201);
			response.setMessage("Success");
			response.setDiscription("products found");
			response.setBeans(list);;
		} else {
			response.setStatusacode(401);
			response.setMessage("Failure");
			response.setDiscription("No data");
		}
		return response;
		
	}
	
	
	@GetMapping(path="/searchOrder",produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderInfoResponse searchOrder(@RequestParam("id") String id) throws IdNotFoundException {
		OrderInfoResponse response = new OrderInfoResponse();
		List<OrderInfo> order=service1.retrieveorder(id);
		if(order!=null) {
			response.setStatusacode(201);
			response.setMessage("Success");
			response.setDiscription("product found");
			response.setBeans(order);
		} else {
			response.setStatusacode(401);
			response.setMessage("Failure");
			response.setDiscription("product id does not exist");
		}
		return response;
	}
	
	
	
	
	

}