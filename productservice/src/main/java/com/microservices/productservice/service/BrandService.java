package com.microservices.productservice.service;

import java.util.List;

import com.microservices.productservice.entity.Brand;
import com.microservices.productservice.request.CreateBrandRequest;

public interface BrandService  {
	
public Brand findByName(String name);
	
	public List<Brand> findByNameStartingWith(String value);
	
	public List<Brand> findByNameContaining(String value);
	
	public Brand findByNameIgnoreCase(String value);
	
	public List<Brand> getAll();
	
	public Brand createNewBrand(CreateBrandRequest request);
	
	public String deleteById(Integer id);
	
	public String deleteByName(String name);
	
	
	
	
	

}
