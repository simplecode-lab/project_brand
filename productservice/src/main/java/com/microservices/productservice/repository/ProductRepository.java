package com.microservices.productservice.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.productservice.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	public Product findByName(String name);
	
	public List<Product> findByPrice(Integer value);
	
	public List<Product> findByPriceLessThanEqual(Integer value);
	
	public List<Product> findByPriceBetween(Integer low,Integer high);
	
	
	public Product findBySize(Integer value);
	
	public List<Product> findBySizeIn(Collection<Integer> sizes);
	
	public List<Product> findBySizeGreaterThanEqual(Integer value);
	
	public List<Product> findByPriceAndSizeGreaterThan(Integer price,Integer size);
	
	public List<Product>findByPriceLessThanAndSizeGreaterThan(Integer price,Integer size);
	
	
	
	

}
