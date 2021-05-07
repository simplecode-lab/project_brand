package com.microservices.productservice.service;

import java.util.List;

import com.microservices.productservice.entity.Category;
import com.microservices.productservice.request.CreateCategoryRequest;

public interface CategoryService {

	
public Category findByName(String value);
	
	public List<Category> findByNameStartingWith(String value);
	
	public List<Category> findByNameContaining(String name);
	
	public List<Category> getAll();
	
	public Category createNewCategory(CreateCategoryRequest request);
}
