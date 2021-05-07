package com.microservices.productservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservices.productservice.entity.Category;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Integer>{
	
	public Category findByName(String value);
	
	public List<Category> findByNameStartingWith(String value);
	
	public List<Category> findByNameContaining(String name);
	
	
	
	

}
