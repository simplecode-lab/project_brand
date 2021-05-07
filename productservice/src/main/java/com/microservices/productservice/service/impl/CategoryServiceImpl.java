package com.microservices.productservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.productservice.entity.Category;
import com.microservices.productservice.repository.CategoryRepository;
import com.microservices.productservice.request.CreateCategoryRequest;
import com.microservices.productservice.service.CategoryService;


@Service
public class CategoryServiceImpl  implements CategoryService{
	
	@Autowired
	private CategoryRepository categoryrepo;
	

	@Override
	public Category findByName(String value) {
		return categoryrepo.findByName(value);
	}

	@Override
	public List<Category> findByNameStartingWith(String value) {
		return categoryrepo.findByNameStartingWith(value);
	}

	@Override
	public List<Category> findByNameContaining(String name) {
		return categoryrepo.findByNameContaining(name);
	}

	@Override
	public List<Category> getAll() {
		return categoryrepo.findAll();
	}

	@Override
	public Category createNewCategory(CreateCategoryRequest request) {
	Category category=new Category();
	category.setName(request.getName());
	category=categoryrepo.save(category);
		return category;
	}

}
