package com.microservices.productservice.service;

import java.util.Collection;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.microservices.productservice.entity.Product;
import com.microservices.productservice.request.CreateProductRequest;

public interface ProductService {

	public Product findByName(String name);

	public List<Product> findByPrice(Integer value);

	public List<Product> findByPriceLessThanEqual(Integer value);

	public List<Product> findByPriceBetween(Integer low, Integer high);

	public Product findBySize(Integer value);

	public List<Product> findBySizeIn(Collection<Integer> sizes);

	public List<Product> findBySizeGreaterThanEqual(Integer value);

	public List<Product> findByPriceAndSizeGreaterThan(Integer price, Integer size);

	public List<Product> findByPriceLessThanAndSizeGreaterThan(Integer price, Integer size);

	public List<Product> getAll();

	public Product createNewProduct(@RequestBody CreateProductRequest request);

	public String deleteByName(String name);
	
	

}
