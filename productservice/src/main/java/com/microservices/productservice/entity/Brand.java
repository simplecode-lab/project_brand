package com.microservices.productservice.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BRAND")
public class Brand {
	
	@Id//primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)//required for auto generating primary key value
	private int id;
	private String name;
	
	@OneToMany(mappedBy="brand")
	private Set<Product> products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + "]";
	}

}
