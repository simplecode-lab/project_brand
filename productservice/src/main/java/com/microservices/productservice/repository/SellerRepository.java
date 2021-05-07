package com.microservices.productservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.productservice.entity.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Integer>{
	
	public Seller findByName(String value);
	
	

}
