package com.microservices.productservice.service;

import java.util.List;

import com.microservices.productservice.entity.Seller;
import com.microservices.productservice.request.CreateSellerRequest;

public interface SellerService {
	
	public Seller findByName(String value);
	
	public List<Seller> getAll();
	
	public Seller createNewSeller(CreateSellerRequest request);

}
