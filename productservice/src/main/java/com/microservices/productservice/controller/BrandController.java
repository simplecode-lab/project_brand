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

import com.microservices.productservice.entity.Brand;
import com.microservices.productservice.request.CreateBrandRequest;
import com.microservices.productservice.service.BrandService;

@RestController
@RequestMapping("/brands")
public class BrandController {

	@Autowired
	private BrandService brandservice;

	@GetMapping(path = "/")
	public List<Brand> getAll() {
		return brandservice.getAll();
	}

	@DeleteMapping("/id/{id}")
	public String deleteById(@PathVariable Integer id) {
		return brandservice.deleteById(id);

	}

	@DeleteMapping("/name/{name}")
	public String deleteByName(@PathVariable String name) {
		String message = brandservice.deleteByName(name);
		return message;
	}

	@GetMapping(path = "/name-ignorecase/{name}")
	public Brand getBrandNameByIgnoreCase(@PathVariable String name) {
		return brandservice.findByNameIgnoreCase(name);

	}

	@PostMapping("/")
	public Brand createNewBrand(@RequestBody CreateBrandRequest request) {
		Brand brand = brandservice.createNewBrand(request);
		return brand;
	}

}
