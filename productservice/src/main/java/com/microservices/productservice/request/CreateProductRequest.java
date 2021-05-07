package com.microservices.productservice.request;

import com.microservices.productservice.entity.Brand;
import com.microservices.productservice.entity.Seller;

public class CreateProductRequest {

	private String name;
	
	private int size;
	
	private int price;
	
	private int quantity;
	
	private Brand brand;
	 private Seller seller;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
