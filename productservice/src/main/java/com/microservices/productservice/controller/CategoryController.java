package com.microservices.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.productservice.entity.Category;
import com.microservices.productservice.request.CreateCategoryRequest;
import com.microservices.productservice.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryservice;
	
	 @GetMapping("/")
	 public List<Category> getAll(){
		 return categoryservice.getAll();
		 
	 }
	 
	@PostMapping("/")
	public Category createNewCategory(@RequestBody CreateCategoryRequest request) {
		Category category=categoryservice.createNewCategory(request);
		return category;
	}
}
