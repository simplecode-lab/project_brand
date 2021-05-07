package com.microservices.productservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.productservice.entity.Seller;
import com.microservices.productservice.repository.SellerRepository;
import com.microservices.productservice.request.CreateSellerRequest;
import com.microservices.productservice.service.SellerService;

@Service

public class SellerServiceImpl implements SellerService {

	@Autowired
	private SellerRepository sellerrepo;

	@Override
	public Seller findByName(String value) {
		return sellerrepo.findByName(value);
	}

	@Override
	public List<Seller> getAll() {
		return sellerrepo.findAll();
	}

	@Override
	public Seller createNewSeller(CreateSellerRequest request) {
		Seller seller=new Seller();
		seller.setName(request.getName());
		seller=sellerrepo.save(seller);
		return seller;
	}

}
