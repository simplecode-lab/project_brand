package com.microservices.productservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.productservice.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
	
	public Brand findByName(String name);
	
	public List<Brand> findByNameStartingWith(String value);
	
	public List<Brand> findByNameContaining(String value);
	
	public Brand findByNameIgnoreCase(String value);
	

}
