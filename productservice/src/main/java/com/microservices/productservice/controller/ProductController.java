package com.microservices.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.productservice.entity.Product;
import com.microservices.productservice.request.CreateProductRequest;
import com.microservices.productservice.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productservice;
	
	@GetMapping(path="/")
	public List<Product> getAll(){
		return productservice.getAll();
	}
	
	@PostMapping("/")
	public Product createNewProduct(@RequestBody CreateProductRequest request) {
		Product product=productservice.createNewProduct(request);
		return product;
		
	}
	@DeleteMapping("/name/{name}")
	public String deleteByName(@PathVariable String name) {
		return name;
		
	}
}
