package com.microservices.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.productservice.entity.Seller;
import com.microservices.productservice.request.CreateSellerRequest;
import com.microservices.productservice.service.SellerService;

@RestController
@RequestMapping("/seller")
public class SellerController {
	
	@Autowired
	private SellerService sellerservice;
	
	@GetMapping(path="/")
	public List<Seller> getAll(){
		return sellerservice.getAll();
		
	}
@PostMapping("/")
public Seller createNewSeller(@RequestBody CreateSellerRequest request) {
	Seller seller=sellerservice.createNewSeller(request);
	return seller;
	
}
	
}
