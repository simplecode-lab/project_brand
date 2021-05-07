package com.microservices.productservice.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.productservice.entity.Product;
import com.microservices.productservice.repository.ProductRepository;
import com.microservices.productservice.request.CreateProductRequest;
import com.microservices.productservice.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productrepo;

	@Override
	public Product findByName(String name) {
		return productrepo.findByName(name);
	}

	@Override
	public List<Product> findByPrice(Integer value) {
		return productrepo.findByPrice(value);
	}

	@Override
	public List<Product> findByPriceLessThanEqual(Integer value) {
		return productrepo.findByPriceLessThanEqual(value);
	}

	@Override
	public List<Product> findByPriceBetween(Integer low, Integer high) {
		return productrepo.findByPriceBetween(low, high);
	}

	@Override
	public Product findBySize(Integer value) {
		return productrepo.findBySize(value);
	}

	@Override
	public List<Product> findBySizeIn(Collection<Integer> sizes) {
		return productrepo.findBySizeIn(sizes);
	}

	@Override
	public List<Product> findBySizeGreaterThanEqual(Integer value) {
		return productrepo.findBySizeGreaterThanEqual(value);
	}

	@Override
	public List<Product> findByPriceAndSizeGreaterThan(Integer price, Integer size) {
		return productrepo.findByPriceAndSizeGreaterThan(price, size);
	}

	@Override
	public List<Product> findByPriceLessThanAndSizeGreaterThan(Integer price, Integer size) {
		return productrepo.findByPriceLessThanAndSizeGreaterThan(price, size);
	}

	@Override
	public List<Product> getAll() {
		return productrepo.findAll();
	}

	@Override
	public Product createNewProduct(CreateProductRequest request) {
		Product product = new Product();
		product.setName(request.getName());
		product.setPrice(request.getPrice());
		product.setSize(request.getSize());
		product.setQuantity(request.getQuantity());
		product = productrepo.save(product);
		return product;
	}

	@Override
	public String deleteByName(String name) {
		Product product = productrepo.findByName(name);
		if(product !=null) {
			product.getId();
		}

		return null;
	}

}
