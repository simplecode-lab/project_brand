 package com.microservices.productservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.productservice.entity.Brand;
import com.microservices.productservice.repository.BrandRepository;
import com.microservices.productservice.request.CreateBrandRequest;
import com.microservices.productservice.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired

	private BrandRepository brandrepo;

	@Override
	public Brand findByName(String name) {
		return brandrepo.findByName(name);
	}

	@Override
	public List<Brand> findByNameStartingWith(String value) {
		return brandrepo.findByNameStartingWith(value);
	}

	@Override
	public List<Brand> findByNameContaining(String value) {
		return brandrepo.findByNameContaining(value);
	}

	@Override
	public Brand findByNameIgnoreCase(String value) {
		return brandrepo.findByNameIgnoreCase(value);
	}

	@Override
	public List<Brand> getAll() {
		return brandrepo.findAll();
	}

	@Override
	public Brand createNewBrand(CreateBrandRequest request) {
		Brand brand = new Brand();

		String t1 = request.getName();
		brand.setName(t1);
		brand = brandrepo.save(brand);
		return brand;

	}

	@Override
	public String deleteById(Integer id) {

		try {
			brandrepo.deleteById(id);

		} catch (Exception ex) {
			return ex.getMessage();
		}
		return "Brand deleted succesfully";

	}

	@Override
	public String deleteByName(String name) {
		Brand brand = brandrepo.findByNameIgnoreCase(name);
		if (brand != null) {
			Integer id = brand.getId();
			try {

				brandrepo.deleteById(id);
				return "Brand with name=" + name + " Deleted";
			} catch (Exception ex) {
				return ex.getMessage();
			}

		} else {
			return "Brand with name=" + name + " does not exist";

		}

	}

}
